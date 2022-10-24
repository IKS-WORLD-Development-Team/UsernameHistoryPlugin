package kr.iksworld.plugin.usernamehistory.dto.event;

import java.util.UUID;

public class GeneralPlayerEventDto {
    private String username;
    private UUID uuid;
    private long time;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setTime(long time) {
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
