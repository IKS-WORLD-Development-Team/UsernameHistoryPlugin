package kr.iksworld.plugin.usernamehistory.service.impl;

import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.service.HistoryService;

import java.util.List;
import java.util.Optional;

public class UsernameHistoryService<K, V> implements HistoryService<K, V> {

    @Override
    public boolean create(History history) {
        return false;
    }

    @Override
    public boolean update(History history, long id) {
        return false;
    }

    @Override
    public Optional<History<K, V>> get(K key, long id) {
        return null;
    }

    @Override
    public Optional<History<K, V>> getByKey(K key, long id) {
        return Optional.empty();
    }

    @Override
    public Optional<History<K, V>> getByValue(V value, long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<History<K, V>>> searchByKey(String keyQuery) {
        return Optional.empty();
    }

    @Override
    public Optional<List<History<K, V>>> searchByValue(String valueQuery) {
        return Optional.empty();
    }

    @Override
    public boolean delete(K key, long id) {
        return false;
    }
}
