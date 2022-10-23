package kr.iksworld.plugin.usernamehistory.root;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class RootFactory {

    private static RootFactory instance = new RootFactory();

    private CommandExecutor commandExecutor;

    private Listener listener;

    private RootFactory() {
        commandExecutor = new RootCommandExecutor();
        listener = new RootListener();
    }

    public static RootFactory getInstance() {
        return instance;
    }

    public CommandExecutor commandExecutor() {
        return commandExecutor;
    }

    public Listener listener() {
        return listener;
    }
}
