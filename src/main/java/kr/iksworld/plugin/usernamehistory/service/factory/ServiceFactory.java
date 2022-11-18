package kr.iksworld.plugin.usernamehistory.service.factory;


import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import kr.iksworld.plugin.usernamehistory.service.impl.UsernameHistoryService;

import java.util.UUID;

public class ServiceFactory {
    public static HistoryService<UUID, String> usernameHistoryService = new UsernameHistoryService<>();

    public static HistoryService<UUID, String> usernameHistoryService() {
        return usernameHistoryService;
    }
}
