package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.service.exception.DaoException;

/**
 * HistoryUpdateService 인터페이스.
 * (A interface of HistoryUpdateService.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public interface HistoryUpdateService<K, V> {

    boolean joinUpdate(K key, V value) throws DaoException;

    boolean quitUpdate(K key, V value) throws DaoException;

}
