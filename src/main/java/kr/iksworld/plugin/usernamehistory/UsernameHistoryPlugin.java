package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.controller.PlayerController;
import kr.iksworld.plugin.usernamehistory.controller.UsernameHistoryController;
import kr.iksworld.plugin.usernamehistory.dao.HistoryDao;
import kr.iksworld.plugin.usernamehistory.dao.YmlHistoryDao;
import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.HistoryUpdateService;
import kr.iksworld.plugin.usernamehistory.service.UsernameHistoryService;
import kr.iksworld.plugin.usernamehistory.service.UsernameHistoryUpdateService;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

/**
 * JavaPlugin을 상속하는 메인 클래스
 * (Main class extending JavaPlugin)
 */
public class UsernameHistoryPlugin extends JavaPlugin {

    private static UsernameHistoryPlugin instance;

    public static UsernameHistoryPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        // Setup
        HistoryDao<UUID, String> usernameHistoryDao = new YmlHistoryDao();
        HistoryService<UUID, String> usernameHistoryService = new UsernameHistoryService<>(usernameHistoryDao);
        HistoryUpdateService<UUID, String> usernameHistoryUpdateService = new UsernameHistoryUpdateService<>();

        // CommandExecutor
        CommandExecutor usernameHistoryController = new UsernameHistoryController(usernameHistoryService);
        getCommand("usernamehistory").setExecutor(usernameHistoryController);
        getCommand("unh").setExecutor(usernameHistoryController);

        // Listener
        Listener playerController = new PlayerController(usernameHistoryUpdateService);
        getServer().getPluginManager().registerEvents(playerController, this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
