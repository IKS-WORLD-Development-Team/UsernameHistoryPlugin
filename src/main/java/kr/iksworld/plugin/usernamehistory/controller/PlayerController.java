package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.service.factory.ServiceFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;

/**
 * 플레이어의 입퇴장을 Action으로 받는 Controller입니다.
 */
public class PlayerController implements Listener {

    /**
     * 플레이어가 입장하면 실행되는 메소드입니다.
     */
    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        History<String, UUID> history = new History(player.getName(), player.getUniqueId());
        boolean isCreated = ServiceFactory.usernameHistoryService().update(history);
    }

    /**
     * 플레이어가 퇴장하면 실행되는 메소드입니다.
     */
    @EventHandler
    public void playerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        History<String, UUID> history = new History(player.getName(), player.getUniqueId());
        boolean isCreated = ServiceFactory.usernameHistoryService().update(history);
    }
}
