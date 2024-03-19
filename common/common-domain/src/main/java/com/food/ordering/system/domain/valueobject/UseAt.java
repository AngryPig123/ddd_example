package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public class UseAt {
    private boolean useAt;

    public UseAt(boolean useAt) {
        this.useAt = useAt;
    }

    public boolean isUseAt() {
        return useAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UseAt useAt1 = (UseAt) o;
        return isUseAt() == useAt1.isUseAt();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isUseAt());
    }

}
