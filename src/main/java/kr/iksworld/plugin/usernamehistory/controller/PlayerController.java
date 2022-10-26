package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.dto.event.PlayerJoinEventDto;
import kr.iksworld.plugin.usernamehistory.dto.event.PlayerQuitEventDto;

public class PlayerController {
    public void playerJoin(PlayerJoinEventDto event) {

                String.format("Username: %s, UUID: %s, Time: %ld",
                        event.getUsername(),
                        event.getUuid().toString(),
                        event.getTime()
                );
    }

    public void playerQuit(PlayerQuitEventDto event) {

                String.format("Username: %s, UUID: %s, Time: %ld",
                        event.getUsername(),
                        event.getUuid().toString(),
                        event.getTime()
                );
    }
}
