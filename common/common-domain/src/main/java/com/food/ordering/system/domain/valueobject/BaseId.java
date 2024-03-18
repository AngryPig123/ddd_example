package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public abstract class BaseId<T> {
    private final T t;

    protected BaseId(T t) {
        this.t = t;
    }

    public T getValue() {
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return Objects.equals(t, baseId.t);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(t);
    }

}
