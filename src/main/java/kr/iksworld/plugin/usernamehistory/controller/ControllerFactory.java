package kr.iksworld.plugin.usernamehistory.controller;

import kr.iksworld.plugin.usernamehistory.controller.impl.PlayerJoinControllerImpl;
import kr.iksworld.plugin.usernamehistory.controller.impl.PlayerQuitControllerImpl;

public class ControllerFactory {
    private PlayerJoinController playerJoinListener;

    private PlayerQuitController playerQuitListener;

    private ControllerFactory() {
        this.playerJoinListener = new PlayerJoinControllerImpl();
        this.playerQuitListener = new PlayerQuitControllerImpl();
    }

    public PlayerJoinController playerJoinController() {
        return playerJoinListener;
    }

    public PlayerQuitController playerQuitController() {
        return playerQuitListener;
    }



    // Singleton

    private static ControllerFactory instance = new ControllerFactory();

    public static ControllerFactory getInstance() {
        return instance;
    }
}
