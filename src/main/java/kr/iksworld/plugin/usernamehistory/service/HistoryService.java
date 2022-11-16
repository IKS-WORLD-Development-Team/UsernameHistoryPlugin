package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;
import java.util.Optional;

public interface HistoryService<K, V> {

    // CREATE

    boolean create(History<K, V> history);

    // UPDATE

    boolean update(History<K, V> history, long id);

    // READ

    Optional<History<K, V>> get(K key, long id);

    Optional<History<K, V>> getByKey(K key, long id);

    Optional<History<K, V>> getByValue(V value, long id);

    Optional<List<History<K, V>>> searchByKey(String keyQuery);

    Optional<List<History<K, V>>> searchByValue(String valueQuery);

    // DELETE

    boolean delete(K key, long id);

}
