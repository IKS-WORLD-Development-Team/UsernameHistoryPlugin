package kr.iksworld.plugin.usernamehistory.dto.result;

public class PlayerJoinResultDto {
    private String message;

    public PlayerJoinResultDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
