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

    // Variable
    private ElementNumberType elementNumberType;
    private SortType sortType;
    private SortBy sortBy;

    private SearcherData<K> keyData;
    private SearcherData<V> valueData;

    private TimeSearcherData startTime;
    private TimeSearcherData endTime;


    public HistorySearchCondition(ElementNumberType elementNumberType, SortType sortType, SortBy sortBy) {
        this.elementNumberType = elementNumberType;
        this.sortType = sortType;
        this.sortBy = sortBy;

        keyData = new SearcherData<>();
        valueData = new SearcherData<>();

        startTime = new TimeSearcherData();
        endTime = new TimeSearcherData();
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


    // TimeSearcher Getter

    public Optional<Long> getStartTimeMin() {
        return startTime.getMin();
    }

    public Optional<Long> getStartTimeMax() {
        return startTime.getMax();
    }

    public Optional<Long> getEndTimeMin() {
        return endTime.getMin();
    }

    public Optional<Long> getEndTimeMax() {
        return endTime.getMax();
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


    // TimeSearcher Setter

    public void setStartTimeMin(long time) {
        startTime.setMin(time);
    }

    public void setStartTimeMinNull() {
        startTime.setMinNull();
    }

    public void setStartTimeMax(long time) {
        startTime.setMax(time);
    }

    public void setStartTimeMaxNull() {
        startTime.setMaxNull();
    }

    public void setEndTimeMin(long time) {
        endTime.setMin(time);
    }

    public void setEndTimeMinNull() {
        endTime.setMinNull();
    }

    public void setEndTimeMax(long time) {
        endTime.setMax(time);
    }

    public void setEndTimeMaxNull() {
        endTime.setMaxNull();
    }


    // Inner Enum

    public enum ElementNumberType {
        ALL, ONLY_FIRST;
    }

    public enum SortType {
        ASCENDING_ORDER, DESCENDING_ORDER;
    }

    public enum SortBy {
        KEY, VALUE, START_TIME, END_TIME;
    }
}
