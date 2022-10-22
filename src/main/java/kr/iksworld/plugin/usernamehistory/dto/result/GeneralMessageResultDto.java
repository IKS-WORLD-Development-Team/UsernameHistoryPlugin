package kr.iksworld.plugin.usernamehistory.dto.result;

public class GeneralMessageResultDto {
    private String message;
    private boolean isContainMessage;

    public GeneralMessageResultDto() {
        this.message = "";
        this.isContainMessage = false;
    }

    public GeneralMessageResultDto(String message) {
        this.message = message;
        this.isContainMessage = true;
    }

    public boolean isContainMessage() {
        return isContainMessage;
    }

    public String getMessage() {
        return message;
    }
}
