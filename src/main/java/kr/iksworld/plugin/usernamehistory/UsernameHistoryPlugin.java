package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.root.RootFactory;
import org.bukkit.plugin.java.JavaPlugin;

public class UsernameHistoryPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("usernamehistory").setExecutor(RootFactory.rootCommandExecutor());
        getCommand("unh").setExecutor(RootFactory.rootCommandExecutor());
        getServer().getPluginManager().registerEvents(RootFactory.rootListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
