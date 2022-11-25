package kr.iksworld.plugin.usernamehistory.dto;

/**
 * 이 DTO는 HistoryDao에서 사용할 검색 조건을 포함하고 있습니다.
 * (This DTO contains conditions to use in HistoryDao.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
public class HistorySearchCondition<K, V> {
    private ElementNumberType elementNumberType = ElementNumberType.ALL;
    private SortType sortType = SortType.ASCENDING_ORDER;
    private SortBy sortBy = SortBy.START_TIME;

    private K keyEqualSearcher;
    private V valueEqualSearcher;
    private String keyContainSearcher;
    private String valueContainSearcher;

    private long startTimeMin;
    private long startTimeMax;
    private long endTimeMin;
    private long endTimeMax;


    // Inner Class

    enum ElementNumberType {
        ALL, ONLY_FIRST;
    }

    enum SortType {
        ASCENDING_ORDER, DESCENDING_ORDER;
    }

    enum SortBy {
        KEY, VALUE, START_TIME, END_TIME;
    }
}
