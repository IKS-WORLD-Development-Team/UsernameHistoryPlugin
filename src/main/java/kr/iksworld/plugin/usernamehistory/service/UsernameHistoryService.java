package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dao.HistoryDao;
import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;

public class UsernameHistoryService<K, V> implements HistoryService<K, V> {

    private HistoryDao<K, V> historyDao;

    public UsernameHistoryService(HistoryDao<K, V> historyDao) {
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

    @Override
    public List<History<K, V>> getByKey(K key) {
        return null;
    }

    @Override
    public List<History<K, V>> getByValue(V value) {
        return null;
    }

    @Override
    public List<History<K, V>> searchByKey(String keyQuery) {
        return null;
    }

    @Override
    public List<History<K, V>> searchByValue(String valueQuery) {
        return null;
    }
}
