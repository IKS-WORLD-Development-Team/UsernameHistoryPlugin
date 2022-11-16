package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;
import java.util.Optional;

public interface HistoryService<K, V> {

    // CREATE

    boolean create(History<K, V> history);

    // UPDATE

    boolean update(History<K, V> history, long id);

    // GET

    Optional<History<K, V>> get(K key, long id);

    Optional<List<History<K, V>>> searchByKey(K key);

    Optional<List<History<K, V>>> searchByValue(V value);

    // DELETE

    boolean delete(K key, long id);

}
