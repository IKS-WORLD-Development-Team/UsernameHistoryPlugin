package kr.iksworld.plugin.usernamehistory.dto;

public enum HistoryType {
    JOIN((byte) 0), QUIT((byte) 1);

    private byte value;

    HistoryType(byte value) {
        this.value = value;
    }

    public byte byteValue() {
        return value;
    }
}
