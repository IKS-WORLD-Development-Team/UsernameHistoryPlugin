package kr.iksworld.plugin.usernamehistory.controller.bukkit;

import kr.iksworld.plugin.usernamehistory.controller.PlayerController;
import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RootListener implements Listener {
    private PlayerController playerController = new PlayerController();

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        PlayerJoinEventDto playerJoinEventDto = new PlayerJoinEventDto();
        playerJoinEventDto.setUsername(event.getPlayer().getName());
        playerJoinEventDto.setUuid(event.getPlayer().getUniqueId());
        playerJoinEventDto.setTime(System.currentTimeMillis());

        playerController.playerJoin(playerJoinEventDto);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        PlayerQuitEventDto playerQuitEventDto = new PlayerQuitEventDto();
        playerQuitEventDto.setUsername(event.getPlayer().getName());
        playerQuitEventDto.setUuid(event.getPlayer().getUniqueId());
        playerQuitEventDto.setTime(System.currentTimeMillis());

        playerController.playerQuit(playerQuitEventDto);
    }
}
