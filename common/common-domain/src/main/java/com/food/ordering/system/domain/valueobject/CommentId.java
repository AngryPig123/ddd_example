package com.food.ordering.system.domain.valueobject;

import com.food.ordering.system.domain.entity.BaseEntity;

import java.util.Objects;
import java.util.UUID;

public class CommentId extends BaseEntity<UUID> {
    private final UUID commentId;

    public CommentId(UUID commentId) {
        this.commentId = commentId;
    }

    public UUID getCommentId() {
        return commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentId commentId1 = (CommentId) o;
        return Objects.equals(getCommentId(), commentId1.getCommentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommentId());
    }

}
