package kr.iksworld.plugin.usernamehistory.controller;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * 플레이어의 입퇴장을 Action으로 받는 Controller입니다.
 */
public class PlayerController implements Listener {

    /**
     * 플레이어가 입장하면 실행되는 메소드입니다.
     */
    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {

    }

    /**
     * 플레이어가 퇴장하면 실행되는 메소드입니다.
     */
    @EventHandler
    public void playerQuit(PlayerQuitEvent event) {

    }
}
