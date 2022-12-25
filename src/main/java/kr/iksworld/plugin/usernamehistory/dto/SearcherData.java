package kr.iksworld.plugin.usernamehistory.dto;

import java.util.Optional;

public class SearcherData<T> {

    private T rawData = null;
    private String stringData = null;
    private SearcherDataType dataType = SearcherDataType.NULL;
    private ConditionType conditionType = ConditionType.NOT_YET;


    public void setRawData(T rawData) {
        if (rawData == null) {
            setNull();
            return;
        }
        this.rawData = rawData;
        this.dataType = SearcherDataType.RAW;
    }

    public void setStringData(String stringData) {
        if (stringData == null) {
            setNull();
            return;
        }
        this.stringData = stringData;
        this.dataType = SearcherDataType.STRING;
    }

    public void setNull() {
        this.dataType = SearcherDataType.NULL;
        this.conditionType = ConditionType.NOT_YET;
    }

    public void setConditionType(ConditionType conditionType) {
        this.conditionType = conditionType;
    }


    public SearcherDataType getDataType() {
        return dataType;
    }

    public ConditionType getConditionType() {
        return conditionType;
    }

    public Optional<Object> get() {
        switch (dataType) {
            case RAW -> {
                return Optional.of(rawData);
            }
            case STRING -> {
                return Optional.of(stringData);
            }
            case NULL -> {
                return Optional.ofNullable(null);
            }
        }
        return Optional.ofNullable(null);
    }


    enum SearcherDataType {
        RAW, STRING, NULL;
    }

    enum ConditionType {
        EQUAL, CONTAIN, NOT_YET;
    }

}
