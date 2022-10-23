package kr.iksworld.plugin.usernamehistory.dto.result;

import kr.iksworld.plugin.usernamehistory.view.ViewType;

public class ResultDto {
    private ViewType viewType = ViewType.GENERAL_SEND_CONSOLE_MESSAGE;

    public ResultDto() {}

    public void setViewType(ViewType viewType) {
        this.viewType = viewType;
    }

    public ViewType getViewType() {
        return viewType;
    }
}
