package io.muic.ooc.Commands;


import java.util.HashMap;

/**
 * Created by karn806 on 1/31/17.
 */
public final class CommandParser{
    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            // commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
            put("player info", new PlayerInfoCommand());
            put("quit", new ExitCommand());
        }
    };

    public static Command getCommand(String name) {
        return commands.get(name);
    }


}
