package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dao.HistoryDao;

/**
 * History Update 요청을 처리하는 Service.
 * (A service to process update request about History.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public class UsernameHistoryUpdateService<K, V> implements HistoryUpdateService<K, V> {

    // Dependency Injection
    private HistoryDao<K, V> historyDao;

    public UsernameHistoryUpdateService(HistoryDao<K, V> historyDao) {
        this.historyDao = historyDao;
    }

    @Override
    public boolean joinUpdate(K key, V value) {
        return false;
    }

    @Override
    public boolean quitUpdate(K key, V value) {
        return false;
    }
}
