package com.food.ordering.system.domain.entity;

public abstract class BaseEntity<ID> {
    private ID id;

    public void setId(ID id) {
        this.id = id;
    }

}
