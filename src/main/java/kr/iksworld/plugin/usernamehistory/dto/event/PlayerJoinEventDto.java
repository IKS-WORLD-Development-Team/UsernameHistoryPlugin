package kr.iksworld.plugin.usernamehistory.dto.event;

import java.util.UUID;

public class PlayerJoinEventDto extends GeneralPlayerEventDto {
    public PlayerJoinEventDto(String username, UUID uuid, long time) {
        super(username, uuid, time);
    }
}
