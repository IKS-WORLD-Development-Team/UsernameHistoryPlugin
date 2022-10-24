package kr.iksworld.plugin.usernamehistory.root;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerQuitResultDto;
import kr.iksworld.plugin.usernamehistory.controller.ControllerFactory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RootListener implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        PlayerJoinEventDto playerJoinEventDto = new PlayerJoinEventDto();
        playerJoinEventDto.setUsername(event.getPlayer().getName());
        playerJoinEventDto.setUuid(event.getPlayer().getUniqueId());
        playerJoinEventDto.setTime(System.currentTimeMillis());

        PlayerJoinResultDto resultDto = ControllerFactory.getInstance().playerJoinController().playerJoin(playerJoinEventDto);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        PlayerQuitEventDto playerQuitEventDto = new PlayerQuitEventDto();
        playerQuitEventDto.setUsername(event.getPlayer().getName());
        playerQuitEventDto.setUuid(event.getPlayer().getUniqueId());
        playerQuitEventDto.setTime(System.currentTimeMillis());

        PlayerQuitResultDto resultDto = ControllerFactory.getInstance().playerQuitController().playerQuit(playerQuitEventDto);
    }
}
