package kr.iksworld.plugin.usernamehistory.root;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Locale;

public class RootCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String firstArgs = args[0].toUpperCase(Locale.ROOT);

        switch (firstArgs) {
            case "BYUUID", "USERNAME" -> {
                System.out.println("Call UsernameHistoryRequestListener");
                return true;
            }
            case "BYUSERNAME", "UUID" -> {
                System.out.println("Call UUIDHistoryRequestListener");
                return true;
            }

        }
        return false;
    }
}
