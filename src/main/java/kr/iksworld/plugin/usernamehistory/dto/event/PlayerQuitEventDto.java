package kr.iksworld.plugin.usernamehistory.dto.event;

import java.util.UUID;

public class PlayerQuitEventDto extends GeneralPlayerEventDto {
    public PlayerQuitEventDto(String username, UUID uuid, long time) {
        super(username, uuid, time);
    }
}
