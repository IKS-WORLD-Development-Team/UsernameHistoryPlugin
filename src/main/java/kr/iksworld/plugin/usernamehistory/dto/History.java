package kr.iksworld.plugin.usernamehistory.dto;

public class History<K, V> {
    private K key;
    private V value;
    private long time;

    public History(K key, V value) {
        this(key, value, 0);
        time = System.currentTimeMillis();
    }

    public History(K key, V value, long time) {
        this.key = key;
        this.value = value;
        this.time = time;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public long getTimeMillis() {
        return time;
    }

}
