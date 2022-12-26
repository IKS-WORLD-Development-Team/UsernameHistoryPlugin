package kr.iksworld.plugin.usernamehistory.dto;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/**
 * 이 DTO는 HistoryDao에서 사용할 검색 조건을 포함하고 있습니다.
 * (This DTO contains conditions to use in HistoryDao.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */

public class HistorySearchCondition<K, V> {

    // Initial Value
    private final static long INITIAL_TIME_CONDITION = -1;

    // Variable
    private ElementNumberType elementNumberType;
    private SortType sortType;
    private SortBy sortBy;

    private SearcherData<K> keyData;
    private SearcherData<V> valueData;

    private long startTimeMinCondition;
    private long startTimeMaxCondition;
    private long endTimeMinCondition;
    private long endTimeMaxCondition;


    public HistorySearchCondition(ElementNumberType elementNumberType, SortType sortType, SortBy sortBy) {
        this.elementNumberType = elementNumberType;
        this.sortType = sortType;
        this.sortBy = sortBy;

        keyData = new SearcherData<>();
        valueData = new SearcherData<>();

        startTimeMinCondition = INITIAL_TIME_CONDITION;
        startTimeMaxCondition = INITIAL_TIME_CONDITION;
        endTimeMinCondition = INITIAL_TIME_CONDITION;
        endTimeMaxCondition = INITIAL_TIME_CONDITION;
    }


    // Setting Getter

    public ElementNumberType getElementNumberType() {
        return elementNumberType;
    }

    public SortType getSortType() {
        return sortType;
    }

    public SortBy getSortBy() {
        return sortBy;
    }


    // Searcher Getter

    public Optional<Object> getKey() {
        return keyData.get();
    }

    public boolean getKeyConditionType() {
        return transferConditionType(keyData.getConditionType());
    }

    public Optional<Object> getValue() {
        return valueData.get();
    }

    public boolean getValueConditionType() {
        return transferConditionType(valueData.getConditionType());
    }

    // Searcher Getter Logic
    private boolean transferConditionType(SearcherData.ConditionType conditionType) {
        switch (conditionType) {
            case EQUAL, NOT_YET -> {
                return true;
            }
            case CONTAIN -> {
                return false;
            }
        }
        return false;
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


    // Setting Setter

    public void setElementNumberType(@NotNull ElementNumberType elementNumberType) {
        this.elementNumberType = elementNumberType;
    }

    public void setSortType(@NotNull SortType sortType) {
        this.sortType = sortType;
    }

    public void setSortBy(@NotNull SortBy sortBy) {
        this.sortBy = sortBy;
    }


    // Searcher Setter

    public void setKey(K key, @NotNull boolean isEqual) {
        setSearcherData(keyData, key, isEqual);
    }

    public void setKey(String key, @NotNull boolean isEqual) {
        setSearcherData(keyData, key, isEqual);
    }

    public void setKeyNull() {
        setSearcherDataNull(keyData);
    }

    public void setValue(V value, @NotNull boolean isEqual) {
        setSearcherData(valueData, value, isEqual);
    }

    public void setValue(String value, @NotNull boolean isEqual) {
        setSearcherData(valueData, value, isEqual);
    }

    public void setValueNull() {
        setSearcherDataNull(keyData);
    }

    // Searcher Setter Logic
    private <X> void setSearcherData(SearcherData<X> data, X value, boolean b) {
        data.setRawData(value);
        data.setConditionType(transferBoolean(b));
    }

    private <X> void setSearcherData(SearcherData<X> data, String value, boolean b) {
        data.setStringData(value);
        data.setConditionType(transferBoolean(b));
    }

    private <X> void setSearcherDataNull(SearcherData<X> data) {
        data.setStringData(null);
    }

    private SearcherData.ConditionType transferBoolean(boolean b) {
        if (b) {
            return SearcherData.ConditionType.EQUAL;
        } else {
            return SearcherData.ConditionType.CONTAIN;
        }
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
