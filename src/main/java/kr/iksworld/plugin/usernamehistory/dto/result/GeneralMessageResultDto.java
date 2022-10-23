package kr.iksworld.plugin.usernamehistory.dto.result;

public class GeneralMessageResultDto extends ResultDto {
    private String message = "";
    private boolean isContainMessage = false;

    public GeneralMessageResultDto() {

    }

    public void setMessage(String message) {
        this.message = message;
        this.isContainMessage = true;
    }

    public void deleteMessage() {
        this.message = "";
        this.isContainMessage = false;
    }

    public boolean isContainMessage() {
        return isContainMessage;
    }

    public String getMessage() {
        return message;
    }
}
