package kr.iksworld.plugin.usernamehistory.dao;

import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.dto.HistorySearchCondition;

import java.util.List;

/**
 * YML History 데이터에 접근하는 DAO.
 *
 * (A DAO to access YML History data.)
 */
public class YmlHistoryDao<K, V> implements HistoryDao<K, V> {
    @Override
    public boolean create(History<K, V> history) {
        return false;
    }

    @Override
    public List<History<K, V>> get(HistorySearchCondition historySearchCondition) {
        return null;
    }
}
