package kr.iksworld.plugin.usernamehistory.service;

import kr.iksworld.plugin.usernamehistory.dto.History;

import java.util.List;

public interface HistoryService<T, K> {

    // CREATE

    boolean create(History<T, K> history);

    // UPDATE

    boolean update(History<T, K> history, long id);

    // GET

    History<T, K> get(T key, long id);

    List<History<T, K>> searchByKey(T key);

    List<History<T, K>> searchByValue(K value);

    // DELETE

    boolean delete(T key, long id);

}
