package kr.iksworld.plugin.usernamehistory.service;

public interface LogService<T, K> {

    boolean updateJoinLog(T id, K value, long time);

    boolean updateQuitLog(T id, K value, long time);


}
