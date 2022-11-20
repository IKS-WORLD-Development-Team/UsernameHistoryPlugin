package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;

/**
 * HistoryService 인터페이스.
 * (A interface of HistoryService.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
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
