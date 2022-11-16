package kr.iksworld.plugin.usernamehistory.dto;

public class History<T, K> {
    private T key;
    private K value;
    private long time;

    public History(T key, K value) {
        this(key, value, 0);
        time = System.currentTimeMillis();
    }

    public History(T key, K value, long time) {
        this.key = key;
        this.value = value;
        this.time = time;
    }

    public T getKey() {
        return key;
    }

    public K getValue() {
        return value;
    }

    public long getTimeMillis() {
        return time;
    }

}
