package kr.iksworld.plugin.usernamehistory.dto;

/**
 * 이 DTO는 유저 식별자, 유저 별명, 사용 기간 정보를 포합하고 있습니다.
 * (This DTO contains information of user identifier, user nickname, and period of use.)
 * @param <K> 유저 식별자 (user identifier)
 * @param <V> 유저 별명 (user nickname)
 */
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
