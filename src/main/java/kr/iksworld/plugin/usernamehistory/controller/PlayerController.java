package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.factory.ServiceFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * 플레이어의 입퇴장을 Action으로 받는 Controller입니다.
 */
public class PlayerController implements Listener {

    /**
     * PlayerController에서 사용하는 HistoryService입니다.
     */
    private HistoryService usernameHistoryService;

    /**
     * 생성자입니다. 객체 생성 시 HistoryService를 주입받습니다.
     */
    public PlayerController() {
        usernameHistoryService = ServiceFactory.usernameHistoryService();
    }

    /**
     * 플레이어가 입장하면 실행되는 메소드입니다.
     */
    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        boolean isUpdated = usernameHistoryService.joinUpdate(player.getUniqueId(), player.getName());
    }

    /**
     * 플레이어가 퇴장하면 실행되는 메소드입니다.
     */
    @EventHandler
    public void playerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        boolean isUpdated = usernameHistoryService.quitUpdate(player.getUniqueId(), player.getName());
    }
}
