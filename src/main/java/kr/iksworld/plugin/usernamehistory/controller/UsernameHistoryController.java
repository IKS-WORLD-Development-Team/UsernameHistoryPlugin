package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.service.HistoryService;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Locale;

/**
 * 이 오브젝트는 명령어 사용 기록을 제어합니다.
 * 기록들은 HistoryService로 갑니다.
 *
 * (This object controls records using commands.
 * Records go to HistoryService.)
 */
public class UsernameHistoryController implements CommandExecutor {

    // DI

    private HistoryService usernameHistoryService;

    public UsernameHistoryController(HistoryService historyService) {
        usernameHistoryService = historyService;
    }

    // Handle

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (args[0].toUpperCase(Locale.ROOT)) {
            case "BYUUID", "USERNAME" -> this.usernameHistory(sender, command, label, args);
            case "BYUSERNAME", "UUID" -> this.uuidHistory(sender, command, label, args);
            default -> { return false; }
        }
        return true;
    }

    public void usernameHistory(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("username ㅇ");
    }

    public void uuidHistory(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("uuid ㅇ");
    }
}
