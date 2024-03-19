package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.*;

public class Comment extends AggregateRoot<CommentId> {

    private final PostId postId;
    private final UserId userId;
    private final Content content;

    private CreateAndUpdateDate createAndUpdateDate;

    private final UseAt useAt;

    private Comment(Builder builder) {
        postId = builder.postId;
        userId = builder.userId;
        content = builder.content;
        createAndUpdateDate = builder.createAndUpdateDate;
        useAt = builder.useAt;
    }


    public static final class Builder {
        private PostId postId;
        private UserId userId;
        private Content content;
        private CreateAndUpdateDate createAndUpdateDate;
        private UseAt useAt;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder postId(PostId val) {
            postId = val;
            return this;
        }

        public Builder userId(UserId val) {
            userId = val;
            return this;
        }

        public Builder content(Content val) {
            content = val;
            return this;
        }

        public Builder createAndUpdateDate(CreateAndUpdateDate val) {
            createAndUpdateDate = val;
            return this;
        }

        public Builder useAt(UseAt val) {
            useAt = val;
            return this;
        }

        public Comment build() {
            return new Comment(this);
        }
    }
}
