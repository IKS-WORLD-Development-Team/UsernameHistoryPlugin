package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.UsernameHistoryPlugin;
import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.HistoryUpdateService;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * 이 오브젝트는 플레이어의 입퇴장 기록을 제어합니다.
 * 기록들은 HistoryService로 갑니다.
 *
 * (This object controls join and quit records of players.
 * Records go to HistoryService.)
 */
public class PlayerController implements Listener {

    // DI

    private HistoryUpdateService usernameHistoryUpdateService;

    public PlayerController(HistoryUpdateService historyUpdateService) {
        usernameHistoryUpdateService = historyUpdateService;
    }

    // Handle

    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        boolean isUpdated = usernameHistoryUpdateService.joinUpdate(player.getUniqueId(), player.getName());

        // test
        UsernameHistoryPlugin.getInstance().getLogger().info(player.getUniqueId() + " join");
    }

    @EventHandler
    public void playerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        boolean isUpdated = usernameHistoryUpdateService.quitUpdate(player.getUniqueId(), player.getName());

        // test
        UsernameHistoryPlugin.getInstance().getLogger().info(player.getUniqueId() + " quit");
    }
}
