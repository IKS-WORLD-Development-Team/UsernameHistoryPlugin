package kr.iksworld.plugin.usernamehistory.listener.impl;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;
import kr.iksworld.plugin.usernamehistory.listener.PlayerJoinListener;

public class PlayerJoinListenerImpl implements PlayerJoinListener {
    @Override
    public PlayerJoinResultDto onPlayerJoinEvent(PlayerJoinEventDto event) {
        return new PlayerJoinResultDto(
                String.format("Username: %s, UUID: %s, Time: %ld",
                        event.getUsername(),
                        event.getUuid().toString(),
                        event.getTime()
                )
        );
    }
}
