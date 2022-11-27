package kr.iksworld.plugin.usernamehistory.dto;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * 이 DTO는 HistoryDao에서 사용할 검색 조건을 포함하고 있습니다.
 * (This DTO contains conditions to use in HistoryDao.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */

public class HistorySearchCondition<K, V> {

    // Initial Value

    private final static ElementNumberType INITIAL_ELEMENT_NUMBER_TYPE = ElementNumberType.ALL;
    private final static SortType INITIAL_SORT_TYPE = SortType.ASCENDING_ORDER;
    private final static SortBy INITIAL_SORT_BY = SortBy.START_TIME;
    private final static long INITIAL_TIME_CONDITION = -1;


    // Field

    private ElementNumberType elementNumberType;
    private SortType sortType;
    private SortBy sortBy;

    private K keyEqualCondition;
    private V valueEqualCondition;
    private String keyContainCondition;
    private String valueContainCondition;

    private long startTimeMinCondition;
    private long startTimeMaxCondition;
    private long endTimeMinCondition;
    private long endTimeMaxCondition;


    public HistorySearchCondition() {
        elementNumberType = INITIAL_ELEMENT_NUMBER_TYPE;
        sortType = INITIAL_SORT_TYPE;
        sortBy = INITIAL_SORT_BY;

        keyEqualCondition = null;
        valueEqualCondition = null;
        keyContainCondition = null;
        valueContainCondition = null;

        startTimeMinCondition = INITIAL_TIME_CONDITION;
        startTimeMaxCondition = INITIAL_TIME_CONDITION;
        endTimeMinCondition = INITIAL_TIME_CONDITION;
        endTimeMaxCondition = INITIAL_TIME_CONDITION;
    }


    // Getter

    public ElementNumberType getElementNumberType() {
        return elementNumberType;
    }

    public SortType getSortType() {
        return sortType;
    }

    public SortBy getSortBy() {
        return sortBy;
    }

    public Optional<K> getKeyEqualCondition() {
        return Optional.of(keyEqualCondition);
    }

    public Optional<V> getValueEqualCondition() {
        return Optional.of(valueEqualCondition);
    }

    public Optional<String> getKeyContainCondition() {
        return Optional.of(keyContainCondition);
    }

    public Optional<String> getValueContainCondition() {
        return Optional.of(valueContainCondition);
    }

    public Optional<Long> getStartTimeMinCondition() {
        if (startTimeMinCondition == -1) {
            return Optional.ofNullable(null);
        } else {
            return Optional.of(startTimeMinCondition);
        }
    }

    public Optional<Long> getStartTimeMaxCondition() {
        if (startTimeMaxCondition == -1) {
            return Optional.ofNullable(null);
        } else {
            return Optional.of(startTimeMaxCondition);
        }
    }

    public Optional<Long> getEndTimeMinCondition() {
        if (endTimeMinCondition == -1) {
            return Optional.ofNullable(null);
        } else {
            return Optional.of(endTimeMinCondition);
        }
    }

    public Optional<Long> getEndTimeMaxCondition() {
        if (endTimeMaxCondition == -1) {
            return Optional.ofNullable(null);
        } else {
            return Optional.of(endTimeMaxCondition);
        }
    }


    // Setter

    public void setElementNumberType(@Nonnull ElementNumberType elementNumberType) {
        this.elementNumberType = elementNumberType;
    }

    public void setSortType(@Nonnull SortType sortType) {
        this.sortType = sortType;
    }

    public void setSortBy(@Nonnull SortBy sortBy) {
        this.sortBy = sortBy;
    }

    public void setKeyEqualCondition(K keyEqualCondition) {
        this.keyEqualCondition = keyEqualCondition;
    }

    public void setValueEqualCondition(V valueEqualCondition) {
        this.valueEqualCondition = valueEqualCondition;
    }

    public void setKeyContainCondition(String keyContainCondition) {
        this.keyContainCondition = keyContainCondition;
    }

    public void setValueContainCondition(String valueContainCondition) {
        this.valueContainCondition = valueContainCondition;
    }

    public void setStartTimeMinCondition(long startTimeMinCondition) {
        this.startTimeMinCondition = startTimeMinCondition;
    }

    public void setStartTimeMaxCondition(long startTimeMaxCondition) {
        this.startTimeMaxCondition = startTimeMaxCondition;
    }

    public void setEndTimeMinCondition(long endTimeMinCondition) {
        this.endTimeMinCondition = endTimeMinCondition;
    }

    public void setEndTimeMaxCondition(long endTimeMaxCondition) {
        this.endTimeMaxCondition = endTimeMaxCondition;
    }


    // Reset

    public void resetElementNumberType() {
        setElementNumberType(INITIAL_ELEMENT_NUMBER_TYPE);
    }

    public void resetSortType() {
        setSortType(INITIAL_SORT_TYPE);
    }

    public void resetSortBy() {
        setSortBy(INITIAL_SORT_BY);
    }

    public void resetKeyEqualCondition() {
        setKeyEqualCondition(null);
    }

    public void resetValueEqualCondition() {
        setValueEqualCondition(null);
    }

    public void resetKeyContainCondition() {
        setKeyContainCondition(null);
    }

    public void resetValueContainCondition() {
        setValueContainCondition(null);
    }

    public void resetStartTimeMinCondition() {
        setStartTimeMinCondition(-1);
    }

    public void resetStartTimeMaxCondition() {
        setStartTimeMaxCondition(-1);
    }

    public void resetEndTimeMinCondition() {
        setEndTimeMinCondition(-1);
    }

    public void resetEndTimeMaxCondition() {
        setEndTimeMaxCondition(-1);
    }


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
