package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.controller.PlayerController;
import kr.iksworld.plugin.usernamehistory.controller.UsernameHistoryController;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class UsernameHistoryPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        CommandExecutor usernameHistoryController = new UsernameHistoryController();
        Listener playerController = new PlayerController();

        getCommand("usernamehistory").setExecutor(usernameHistoryController);
        getCommand("unh").setExecutor(usernameHistoryController);
        getServer().getPluginManager().registerEvents(playerController, this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
