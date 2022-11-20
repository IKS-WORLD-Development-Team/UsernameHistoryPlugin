package kr.iksworld.plugin.usernamehistory.dto;

/**
 * 이 DTO는 HistoryDao에서 사용할 검색 조건을 포함하고 있습니다.
 * (This DTO contains conditions to use in HistoryDao.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public class HistorySearchCondition<K, V> {
    ElementNumberType elementNumberType = ElementNumberType.ALL;
    SortType sortType = SortType.ASCENDING_ORDER;




    // Inner Class

    enum ElementNumberType {
        ALL, ONLY_FIRST;
    }

    enum SortType {
        ASCENDING_ORDER, DESCENDING_ORDER;
    }
}
