package kr.iksworld.plugin.usernamehistory.dto;

public class History<K, V> {
    private K key;
    private V value;
    private HistoryType historyType;
    private long time;

    public History(K key, V value, HistoryType historyType) {
        this(key, value, historyType, 0);
        time = System.currentTimeMillis();
    }

    public History(K key, V value, HistoryType historyType, long time) {
        this.key = key;
        this.value = value;
        this.historyType = historyType;
        this.time = time;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public HistoryType getHistoryType() {
        return historyType;
    }

    public long getTimeMillis() {
        return time;
    }

}
