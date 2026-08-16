package nesquik.mytheria.systems.commands;

import a.i;
import java.util.List;

public interface Command {
   List<String> names();

   String description();

   List<i<?>> parameters();

   List<Command> subcommands();

   boolean executable();

   CommandHandler handler();
}
