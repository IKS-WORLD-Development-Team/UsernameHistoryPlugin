package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dao.HistoryDao;
import kr.iksworld.plugin.usernamehistory.dto.History;
import kr.iksworld.plugin.usernamehistory.dto.HistorySearchCondition;
import kr.iksworld.plugin.usernamehistory.service.exception.DaoException;

import java.util.List;

/**
 * History Update 요청을 처리하는 Service.
 * (A service to process update request about History.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public class UsernameHistoryUpdateService<K, V> implements HistoryUpdateService<K, V> {

    // Dependency Injection
    private HistoryDao<K, V> historyDao;

    public UsernameHistoryUpdateService(HistoryDao<K, V> historyDao) {
        this.historyDao = historyDao;
    }

    @Override
    public boolean joinUpdate(K key, V value) throws DaoException {
        HistorySearchCondition<K, V> condition = new HistorySearchCondition<>(
                HistorySearchCondition.ElementNumberType.ONLY_FIRST,
                HistorySearchCondition.SortType.DESCENDING_ORDER,
                HistorySearchCondition.SortBy.START_TIME
        );
        condition.setKey(key, true);
        List<History<K, V>> list = historyDao.get(condition);

        if (list == null) {
            throw new DaoException("DAO sends null");
        } else if (list.size() == 0) {
            return historyDao.create(newHistoryFactory(key, value));
        } else if (list.get(0).getKey().equals(key)) {
            return historyDao.create(newHistoryFactory(key, value));
        } else {
            return false;
        }
    }

    @Override
    public boolean quitUpdate(K key, V value) throws DaoException {
        return false;
    }

    private static <K1, V1> History<K1, V1> newHistoryFactory(K1 key, V1 value) {
        return new History<K1, V1>(key, value, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
