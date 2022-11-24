package kr.iksworld.plugin.usernamehistory.service;

/**
 * History Update 요청을 처리하는 Service.
 * (A service to process update request about History.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public class UsernameHistoryUpdateService<K, V> implements HistoryUpdateService<K, V> {
    @Override
    public boolean joinUpdate(K key, V value) {
        return false;
    }

    @Override
    public boolean quitUpdate(K key, V value) {
        return false;
    }
}
