package kr.iksworld.plugin.usernamehistory.listener.impl;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerQuitResultDto;
import kr.iksworld.plugin.usernamehistory.listener.PlayerQuitListener;

public class PlayerQuitListenerImpl implements PlayerQuitListener {

    @Override
    public PlayerQuitResultDto onPlayerQuitEvent(PlayerQuitEventDto event) {
        return new PlayerQuitResultDto(
                String.format("Username: %s, UUID: %s, Time: %ld",
                        event.getUsername(),
                        event.getUuid().toString(),
                        event.getTime()
                )
        );
    }
}
