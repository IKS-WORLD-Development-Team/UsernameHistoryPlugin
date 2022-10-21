package kr.iksworld.plugin.usernamehistory.root;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class RootFactory {

    private static CommandExecutor commandExecutor;

    private static Listener listener;

    static {
        commandExecutor = new RootCommandExecutor();
        listener = new RootListener();
    }


    public static CommandExecutor commandExecutor() {
        return commandExecutor;
    }

    public static Listener listener() {
        return listener;
    }
}
