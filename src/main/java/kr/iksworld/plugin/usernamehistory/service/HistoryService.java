package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;

public interface HistoryService<K, V> {

    // UPDATE

    boolean joinUpdate(K key, V value);

    boolean quitUpdate(K key, V value);

    // READ

    List<History<K, V>> getByKey(K key);

    List<History<K, V>> getByValue(V value);

    List<History<K, V>> searchByKey(String keyQuery);

    List<History<K, V>> searchByValue(String valueQuery);


}
