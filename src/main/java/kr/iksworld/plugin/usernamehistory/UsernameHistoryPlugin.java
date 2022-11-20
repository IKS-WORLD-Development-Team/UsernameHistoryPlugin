package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.controller.PlayerController;
import kr.iksworld.plugin.usernamehistory.controller.UsernameHistoryController;
import kr.iksworld.plugin.usernamehistory.dao.HistoryDao;
import kr.iksworld.plugin.usernamehistory.dao.YmlHistoryDao;
import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.UsernameHistoryService;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class UsernameHistoryPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        // Setup
        HistoryDao<UUID, String> usernameHistoryDao = new YmlHistoryDao();
        HistoryService<UUID, String> usernameHistoryService = new UsernameHistoryService<>(usernameHistoryDao);

        // CommandExecutor
        CommandExecutor usernameHistoryController = new UsernameHistoryController(usernameHistoryService);
        getCommand("usernamehistory").setExecutor(usernameHistoryController);
        getCommand("unh").setExecutor(usernameHistoryController);

        // Listener
        Listener playerController = new PlayerController(usernameHistoryService);
        getServer().getPluginManager().registerEvents(playerController, this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
