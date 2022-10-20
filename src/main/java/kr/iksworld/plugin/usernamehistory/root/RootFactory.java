package kr.iksworld.plugin.usernamehistory.root;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

import javax.annotation.Nullable;

public class RootFactory {

    private static CommandExecutor rootCommandExecutor;

    private static Listener rootListener;

    static {
        rootCommandExecutor = new RootCommandExecutor();
        rootListener = new RootListener();
    }


    public static CommandExecutor rootCommandExecutor() {
        return rootCommandExecutor;
    }

    public static Listener rootListener() {
        return rootListener;
    }
}
