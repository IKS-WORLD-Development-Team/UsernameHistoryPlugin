package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.controller.bukkit.RootCommandExecutor;
import kr.iksworld.plugin.usernamehistory.controller.bukkit.RootListener;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class UsernameHistoryPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        CommandExecutor commandExecutor = new RootCommandExecutor();
        Listener listener = new RootListener();

        getCommand("usernamehistory").setExecutor(commandExecutor);
        getCommand("unh").setExecutor(commandExecutor);
        getServer().getPluginManager().registerEvents(listener, this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
