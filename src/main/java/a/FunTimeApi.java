package a;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class FunTimeApi {
    private static final String BASE_URL = "https://api.funtime.su/method";
    private static final HttpClient HTTP_CLIENT = HttpClient.newHttpClient();
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(2);

    public record EventData(String server, String id, String phase, String loot, long timeLeft, boolean locationAnnounced, int locX, int locY, int locZ, String eventType) {}
    public record MineData(String serverRuName, String mineName, String mineRarity, String nextMineRarity, int resetSecondsLeft, String serverKey) {}
    public record ServerList(List<String> servers) {}

    public static CompletableFuture<ServerList> fetchServers(String token) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL + "/servers-info"))
                    .header("Authorization-Token", token)
                    .GET().build();
                HttpResponse<String> resp = HTTP_CLIENT.send(req, HttpResponse.BodyHandlers.ofString());
                JsonObject json = JsonParser.parseString(resp.body()).getAsJsonObject();
                if (json.has("response")) {
                    List<String> servers = new ArrayList<>();
                    for (JsonElement e : json.getAsJsonArray("response")) {
                        servers.add(e.getAsString());
                    }
                    return new ServerList(servers);
                }
            } catch (Exception ignored) {}
            return new ServerList(List.of());
        }, EXECUTOR);
    }

    public static CompletableFuture<List<EventData>> fetchEvents(String token, String eventType, String serverFilter) {
        return CompletableFuture.supplyAsync(() -> {
            List<EventData> result = new ArrayList<>();
            try {
                List<String> servers = fetchServerList(token);
                if (servers.isEmpty()) {
                    System.out.println("[FunTime] Events: no servers, cannot query events");
                    return result;
                }

                List<String> queryServers;
                if (serverFilter != null && !serverFilter.isEmpty() && !serverFilter.equals("all")) {
                    queryServers = servers.stream()
                        .filter(s -> s.startsWith(serverFilter))
                        .toList();
                } else {
                    queryServers = servers;
                }

                int batchSize = 30;
                for (int i = 0; i < queryServers.size(); i += batchSize) {
                    List<String> batch = queryServers.subList(i, Math.min(i + batchSize, queryServers.size()));
                    String joined = String.join(",", batch);
                    String url = BASE_URL + "/events-info?event-type=" + eventType + "&server-type=" + joined;
                    HttpRequest req = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .header("Authorization-Token", token)
                        .GET().build();
                    HttpResponse<String> resp = HTTP_CLIENT.send(req, HttpResponse.BodyHandlers.ofString());
                    String body = resp.body();
                    if (resp.statusCode() != 200) {
                        System.out.println("[FunTime] Events HTTP " + resp.statusCode() + ": " + body);
                        continue;
                    }
                    JsonObject json = JsonParser.parseString(body).getAsJsonObject();
                    if (json.has("response")) {
                        for (JsonElement item : json.getAsJsonArray("response")) {
                            JsonObject serverObj = item.getAsJsonObject();
                            String server = serverObj.has("server") ? serverObj.get("server").getAsString() : "";
                            if (serverObj.has("events")) {
                                for (JsonElement ev : serverObj.getAsJsonArray("events")) {
                                    JsonObject e = ev.getAsJsonObject();
                                    String evType = getStr(e, "event-type");
                                    String id = getStr(e, "id");

                                    if ("system".equals(evType) && id.isEmpty()) continue;

                                    String actualType = id.isEmpty() ? evType : id;
                                    String phase = getStr(e, "phase");
                                    String loot = getStr(e, "loot");
                if (loot.equals("null") || loot.equals("NULL")) loot = "";
                                    long timeLeft = e.has("time-seconds-left") ? e.get("time-seconds-left").getAsLong() : 0;
                                    boolean locAnnounced = "true".equals(getStr(e, "location-announced"));
                                    int lx = 0, ly = 0, lz = 0;
                                    if (locAnnounced && e.has("location-event")) {
                                        JsonObject loc = e.getAsJsonObject("location-event");
                                        lx = loc.has("x") ? loc.get("x").getAsInt() : 0;
                                        ly = loc.has("y") ? loc.get("y").getAsInt() : 0;
                                        lz = loc.has("z") ? loc.get("z").getAsInt() : 0;
                                    }
                                    result.add(new EventData(server, id, phase, loot, timeLeft, locAnnounced, lx, ly, lz, actualType));
                                }
                            }
                        }
                    }
                }
                System.out.println("[FunTime] Events: " + result.size() + " found across " + queryServers.size() + " servers");
            } catch (Exception ex) {
                System.out.println("[FunTime] Events error: " + ex.getMessage());
                ex.printStackTrace();
            }
            return result;
        }, EXECUTOR);
    }

    private static List<String> fetchServerList(String token) {
        try {
            HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/servers-info"))
                .header("Authorization-Token", token)
                .GET().build();
            HttpResponse<String> resp = HTTP_CLIENT.send(req, HttpResponse.BodyHandlers.ofString());
            JsonObject json = JsonParser.parseString(resp.body()).getAsJsonObject();
            List<String> servers = new ArrayList<>();
            if (json.has("response")) {
                for (JsonElement e : json.getAsJsonArray("response")) {
                    servers.add(e.getAsString());
                }
            }
            return servers;
        } catch (Exception ex) {
            System.out.println("[FunTime] Server list error: " + ex.getMessage());
            return List.of();
        }
    }

    public static CompletableFuture<List<MineData>> fetchMines(String token, String serverTypes) {
        return CompletableFuture.supplyAsync(() -> {
            List<MineData> result = new ArrayList<>();
            try {
                String url = BASE_URL + "/mines-info?server-types=" + serverTypes;
                HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization-Token", token)
                    .GET().build();
                HttpResponse<String> resp = HTTP_CLIENT.send(req, HttpResponse.BodyHandlers.ofString());
                String body = resp.body();
                if (resp.statusCode() != 200) {
                    System.out.println("[FunTime] Mines HTTP " + resp.statusCode() + ": " + body);
                    return result;
                }
                JsonObject json = JsonParser.parseString(body).getAsJsonObject();
                if (json.has("servers")) {
                    JsonObject servers = json.getAsJsonObject("servers");
                    for (String serverKey : servers.keySet()) {
                        for (JsonElement mine : servers.getAsJsonArray(serverKey)) {
                            JsonObject m = mine.getAsJsonObject();
                            result.add(new MineData(
                                getStr(m, "server-ru-name"),
                                getStr(m, "mine-name"),
                                getStr(m, "mine-rarity"),
                                getStr(m, "next-mine-rarity"),
                                m.has("reset-seconds-left") ? m.get("reset-seconds-left").getAsInt() : 0,
                                serverKey
                            ));
                        }
                    }
                }
                System.out.println("[FunTime] Mines: " + result.size() + " found");
            } catch (Exception ex) {
                System.out.println("[FunTime] Mines error: " + ex.getMessage());
            }
            return result;
        }, EXECUTOR);
    }

    private static String getStr(JsonObject obj, String key) {
        return obj.has(key) && !obj.get(key).isJsonNull() ? obj.get(key).getAsString() : "";
    }
}
