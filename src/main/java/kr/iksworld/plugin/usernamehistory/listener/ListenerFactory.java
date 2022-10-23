package kr.iksworld.plugin.usernamehistory.listener;

import kr.iksworld.plugin.usernamehistory.listener.impl.PlayerJoinListenerImpl;
import kr.iksworld.plugin.usernamehistory.listener.impl.PlayerQuitListenerImpl;

public class ListenerFactory {
    private PlayerJoinListener playerJoinListener;

    private PlayerQuitListener playerQuitListener;

    private ListenerFactory() {
        this.playerJoinListener = new PlayerJoinListenerImpl();
        this.playerQuitListener = new PlayerQuitListenerImpl();
    }

    public PlayerJoinListener playerJoinListener() {
        return playerJoinListener;
    }

    public PlayerQuitListener playerQuitListener() {
        return playerQuitListener;
    }



    // Singleton

    private static ListenerFactory instance = new ListenerFactory();

    public static ListenerFactory getInstance() {
        return instance;
    }
}
