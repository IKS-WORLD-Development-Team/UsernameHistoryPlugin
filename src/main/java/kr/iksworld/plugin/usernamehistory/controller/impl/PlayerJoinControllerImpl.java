package kr.iksworld.plugin.usernamehistory.controller.impl;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.result.PlayerJoinResultDto;
import kr.iksworld.plugin.usernamehistory.controller.PlayerJoinController;

public class PlayerJoinControllerImpl implements PlayerJoinController {
    @Override
    public PlayerJoinResultDto playerJoin(PlayerJoinEventDto event) {
        return new PlayerJoinResultDto(
                String.format("Username: %s, UUID: %s, Time: %ld",
                        event.getUsername(),
                        event.getUuid().toString(),
                        event.getTime()
                )
        );
    }
}
