package kr.iksworld.plugin.usernamehistory.dto.event;

public class PlayerJoinEventDto {

    private String username;
    private String uuid;
    private long time;

    public PlayerJoinEventDto(String username, String uuid, long time) {
        this.username = username;
        this.uuid = uuid;
        this.time = time;
    }
}
