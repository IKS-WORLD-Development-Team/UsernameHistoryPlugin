package kr.iksworld.plugin.usernamehistory.service;

public interface LogService<T, K> {

    /**
     *
     * @param username
     * @param uuid
     * @param time
     * @return
     */
    boolean updatePlayerJoinLog(T username, K uuid, long time);

    boolean updatePlayerQuitLog(T username, K uuid, long time);


}
