package kr.iksworld.plugin.usernamehistory.controller.impl;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerQuitResultDto;
import kr.iksworld.plugin.usernamehistory.controller.PlayerQuitController;

public class PlayerQuitControllerImpl implements PlayerQuitController {

    @Override
    public PlayerQuitResultDto playerQuit(PlayerQuitEventDto event) {
        PlayerQuitResultDto playerQuitResultDto = new PlayerQuitResultDto();
        playerQuitResultDto.setMessage(
                String.format("Username: %s, UUID: %s, Time: %ld",
                event.getUsername(),
                event.getUuid().toString(),
                event.getTime()
        ));

        return playerQuitResultDto;
    }
}
