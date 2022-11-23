package kr.iksworld.plugin.usernamehistory.dao;

import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.dto.HistorySearchCondition;

import java.util.List;

/**
 * HistoryDao 인터페이스
 *
 * (A interface of HistoryDao.)
 */
public interface HistoryDao<K, V> {

    // Create
    boolean create(History<K, V> history);

    // Read
    List<History<K, V>> get(HistorySearchCondition historySearchCondition);

    // Update
    boolean update(History<K, V> history);

    // Delete
    boolean delete(K key, long startTime);
}
