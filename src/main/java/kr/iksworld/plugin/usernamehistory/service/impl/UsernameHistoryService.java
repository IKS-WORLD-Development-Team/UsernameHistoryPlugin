package kr.iksworld.plugin.usernamehistory.service.impl;

import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.service.HistoryService;

import java.util.List;

public class UsernameHistoryService<K, V> implements HistoryService<K, V> {


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
