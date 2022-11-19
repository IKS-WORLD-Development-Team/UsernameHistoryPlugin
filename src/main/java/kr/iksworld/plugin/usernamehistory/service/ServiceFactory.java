package kr.iksworld.plugin.usernamehistory.service;

import java.util.UUID;

public class ServiceFactory {
    public static HistoryService<UUID, String> usernameHistoryService = new UsernameHistoryService<>();

    public static HistoryService<UUID, String> usernameHistoryService() {
        return usernameHistoryService;
    }
}
