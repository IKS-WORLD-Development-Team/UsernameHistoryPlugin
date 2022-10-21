package kr.iksworld.plugin.usernamehistory.listener;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerQuitResultDto;

public interface PlayerQuitListener {
    PlayerQuitResultDto onPlayerQuitEvent(PlayerQuitEventDto event);
}
