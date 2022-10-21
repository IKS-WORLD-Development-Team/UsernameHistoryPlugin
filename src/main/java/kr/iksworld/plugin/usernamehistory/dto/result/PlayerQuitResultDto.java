package kr.iksworld.plugin.usernamehistory.dto.result;

public class PlayerQuitResultDto {
    private String message;

    public PlayerQuitResultDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
