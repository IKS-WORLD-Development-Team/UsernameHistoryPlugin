package kr.iksworld.plugin.usernamehistory.dto.event;

import java.util.UUID;

public class PlayerJoinEventDto {

    private String username;
    private UUID uuid;
    private long time;


    public PlayerJoinEventDto(String username, UUID uuid, long time) {
        this.username = username;
        this.uuid = uuid;
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public UUID getUuid() {
        return uuid;
    }

    public long getTime() {
        return time;
    }
}
