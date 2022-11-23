package kr.iksworld.plugin.usernamehistory.dao;

import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.dto.HistorySearchCondition;

import java.util.List;

/**
 * MySQL 데이터베이스에서 History 데이터에 접근하는 DAO.
 *
 * (A DAO to access History data in MySQL DB.)
 */
public class MysqlHistoryDao<K, V> implements HistoryDao<K, V>{

    @Override
    public boolean create(History<K, V> history) {
        return false;
    }

    @Override
    public List<History<K, V>> get(HistorySearchCondition historySearchCondition) {
        return null;
    }

    @Override
    public boolean update(History<K, V> history) {
        return false;
    }

    @Override
    public boolean delete(K key, long startTime) {
        return false;
    }
}
