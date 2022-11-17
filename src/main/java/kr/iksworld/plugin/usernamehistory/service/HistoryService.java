package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;
import java.util.Optional;

public interface HistoryService<K, V> {

    // UPDATE

    boolean update(History<K, V> history);

    // READ

    Optional<History<K, V>> getByKey(K key, long id);

    Optional<History<K, V>> getByValue(V value, long id);

    Optional<List<History<K, V>>> searchByKey(String keyQuery);

    Optional<List<History<K, V>>> searchByValue(String valueQuery);


}
