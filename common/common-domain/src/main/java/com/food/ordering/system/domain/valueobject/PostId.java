package com.food.ordering.system.domain.valueobject;

import com.food.ordering.system.domain.entity.BaseEntity;

import java.util.Objects;
import java.util.UUID;

public class PostId extends BaseEntity<UUID> {
    private final UUID postId;

    public PostId(UUID postId) {
        this.postId = postId;
    }

    public UUID getPostId() {
        return postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PostId postId1 = (PostId) o;
        return Objects.equals(getPostId(), postId1.getPostId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPostId());
    }

}
