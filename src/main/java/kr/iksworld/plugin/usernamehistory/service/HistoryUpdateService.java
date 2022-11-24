package kr.iksworld.plugin.usernamehistory.service;

/**
 * HistoryUpdateService 인터페이스.
 * (A interface of HistoryUpdateService.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public interface HistoryUpdateService<K, V> {

    boolean joinUpdate(K key, V value);

    boolean quitUpdate(K key, V value);

}
