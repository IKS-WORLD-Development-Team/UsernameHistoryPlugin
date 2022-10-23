package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;

public interface PlayerJoinController {
    PlayerJoinResultDto playerJoin(PlayerJoinEventDto event);
}
