package kr.iksworld.plugin.usernamehistory.listener;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;

public interface PlayerJoinListener {
    PlayerJoinResultDto onPlayerJoinEvent(PlayerJoinEventDto event);
}
