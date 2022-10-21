package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.root.RootFactory;
import org.bukkit.plugin.java.JavaPlugin;

public class UsernameHistoryPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("usernamehistory").setExecutor(RootFactory.commandExecutor());
        getCommand("unh").setExecutor(RootFactory.commandExecutor());
        getServer().getPluginManager().registerEvents(RootFactory.listener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
