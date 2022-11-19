package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.ServiceFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerController implements Listener {

    private HistoryService usernameHistoryService;

    public PlayerController() {
        usernameHistoryService = ServiceFactory.usernameHistoryService();
    }

    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        boolean isUpdated = usernameHistoryService.joinUpdate(player.getUniqueId(), player.getName());
    }

    @EventHandler
    public void playerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        boolean isUpdated = usernameHistoryService.quitUpdate(player.getUniqueId(), player.getName());
    }
}
