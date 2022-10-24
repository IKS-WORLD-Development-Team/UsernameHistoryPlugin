package kr.iksworld.plugin.usernamehistory.root;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class RootCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, String label, String[] args) {
        String firstArgs = args[0].toUpperCase(Locale.ROOT);

        switch (firstArgs) {
            case "BYUUID", "USERNAME" -> {
                System.out.println("Call UsernameHistoryRequestController");
                return true;
            }
            case "BYUSERNAME", "UUID" -> {
                System.out.println("Call UUIDHistoryRequestController");
                return true;
            }

        }
        return false;
    }
}
