package kr.iksworld.plugin.usernamehistory.controller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Locale;

/**
 * 인게임에서 명령어를 사용하는 것을 Action으로 받는 Controller입니다.
 */
public class UsernameHistoryController implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (args[0].toUpperCase(Locale.ROOT)) {
            case "BYUUID", "USERNAME" -> this.usernameHistory(sender, command, label, args);
            case "BYUSERNAME", "UUID" -> this.uuidHistory(sender, command, label, args);
            default -> { return false; }
        }
        return true;
    }

    /**
     * 유저네임의 기록을 요청하면 실행되는 메소드입니다.
     */
    public void usernameHistory(CommandSender sender, Command command, String label, String[] args) {

    }

    /**
     * UUID의 기록을 요청하면 실행되는 메소드입니다.
     */
    public void uuidHistory(CommandSender sender, Command command, String label, String[] args) {

    }
}
