package kr.iksworld.plugin.usernamehistory;

import kr.iksworld.plugin.usernamehistory.root.RootFactory;
import org.bukkit.plugin.java.JavaPlugin;

public class UsernameHistoryPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("usernamehistory").setExecutor(RootFactory.getInstance().commandExecutor());
        getCommand("unh").setExecutor(RootFactory.getInstance().commandExecutor());
        getServer().getPluginManager().registerEvents(RootFactory.getInstance().listener(), this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
