package kr.iksworld.plugin.usernamehistory.service;


import kr.iksworld.plugin.usernamehistory.service.impl.UsernameHistoryService;

import java.util.UUID;

public class ServiceFactory {
    public static HistoryService<String, UUID> usernameHistoryService = new UsernameHistoryService<>();

    public static HistoryService<String, UUID> usernameHistoryService() {
        return usernameHistoryService;
    }
}
