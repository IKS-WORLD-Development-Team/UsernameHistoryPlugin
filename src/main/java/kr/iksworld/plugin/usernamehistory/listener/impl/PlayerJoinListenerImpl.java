package kr.iksworld.plugin.usernamehistory.listener.impl;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;
import kr.iksworld.plugin.usernamehistory.listener.PlayerJoinListener;

public class PlayerJoinListenerImpl implements PlayerJoinListener {
    @Override
    public PlayerJoinResultDto onPlayerJoinEvent(PlayerJoinEventDto event) {
        return new PlayerJoinResultDto();
    }
}
