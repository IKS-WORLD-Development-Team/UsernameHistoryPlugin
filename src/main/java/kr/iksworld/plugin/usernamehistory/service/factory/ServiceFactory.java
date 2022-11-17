package kr.iksworld.plugin.usernamehistory.service.factory;


import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.impl.UsernameHistoryService;

import java.util.UUID;

public class ServiceFactory {
    public static HistoryService<String, UUID> usernameHistoryService = new UsernameHistoryService<>();

    public static HistoryService<String, UUID> usernameHistoryService() {
        return usernameHistoryService;
    }
}
