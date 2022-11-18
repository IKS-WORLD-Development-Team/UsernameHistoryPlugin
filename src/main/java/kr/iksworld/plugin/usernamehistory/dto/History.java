package kr.iksworld.plugin.usernamehistory.dto;

public class History<K, V> {
    private K key;
    private V value;
    private long startTime;
    private long endTime;

    public History(K key, V value, long startTime, long endTime) {
        this.key = key;
        this.value = value;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
