package kr.iksworld.plugin.usernamehistory.controller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Locale;

public class UsernameHistoryController implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (args[0].toUpperCase(Locale.ROOT)) {
            case "BYUUID", "USERNAME" -> this.usernameHistory(sender, command, label, args);
            case "BYUSERNAME", "UUID" -> this.uuidHistory(sender, command, label, args);
            default -> { return false; }
        }
        return true;
    }

    public void usernameHistory(CommandSender sender, Command command, String label, String[] args) {

    }

    public void uuidHistory(CommandSender sender, Command command, String label, String[] args) {

    }
}
