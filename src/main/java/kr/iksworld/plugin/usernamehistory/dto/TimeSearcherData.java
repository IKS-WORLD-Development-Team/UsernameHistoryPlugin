package kr.iksworld.plugin.usernamehistory.dto;

import java.util.Optional;

public class TimeSearcherData {
    private Optional<Long> min;
    private Optional<Long> max;

    public TimeSearcherData() {
        this.max = Optional.empty();
        this.min = Optional.empty();
    }

    public void setMin(long min) {
        this.min = Optional.of(min);
    }

    public void setMinNull() {
        this.min = Optional.empty();
    }

    public void setMax(long max) {
        this.max = Optional.of(max);
    }

    public void setMaxNull() {
        this.max = Optional.empty();
    }

    public Optional<Long> getMin() {
        return min;
    }

    public Optional<Long> getMax() {
        return max;
    }
}
