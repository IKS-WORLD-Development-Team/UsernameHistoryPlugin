package kr.iksworld.plugin.usernamehistory.dto.result;

import java.util.Optional;

public class GeneralMessageResultDto extends ResultDto {
    private Optional<String> message = Optional.ofNullable(null);

    public GeneralMessageResultDto() {

    }

    public void setMessage(String message) {
        this.message = Optional.ofNullable(message);
    }

    public void deleteMessage() {
        this.message = Optional.ofNullable(null);
    }

    public Optional<String> getMessage() {
        return message;
    }
}
