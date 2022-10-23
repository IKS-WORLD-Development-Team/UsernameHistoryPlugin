package kr.iksworld.plugin.usernamehistory.root;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.GeneralMessageResultDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerQuitResultDto;
import kr.iksworld.plugin.usernamehistory.listener.impl.PlayerJoinListenerImpl;
import kr.iksworld.plugin.usernamehistory.listener.impl.PlayerQuitListenerImpl;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RootListener implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        PlayerJoinEventDto playerJoinEventDto = new PlayerJoinEventDto(
                event.getPlayer().getName(),
                event.getPlayer().getUniqueId(),
                System.currentTimeMillis()
        );

        PlayerJoinResultDto resultDto = new PlayerJoinListenerImpl().onPlayerJoinEvent(playerJoinEventDto);
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        PlayerQuitEventDto playerQuitEventDto = new PlayerQuitEventDto(
                event.getPlayer().getName(),
                event.getPlayer().getUniqueId(),
                System.currentTimeMillis()
        );

        PlayerQuitResultDto resultDto = new PlayerQuitListenerImpl().onPlayerQuitEvent(playerQuitEventDto);
    }
}
