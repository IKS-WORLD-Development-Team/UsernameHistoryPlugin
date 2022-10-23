package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerQuitResultDto;

public interface PlayerQuitController {
    PlayerQuitResultDto playerQuit(PlayerQuitEventDto event);
}
