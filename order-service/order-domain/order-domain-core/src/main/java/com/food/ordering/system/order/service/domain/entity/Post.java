package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Post extends AggregateRoot<PostId> {

    private final List<Comment> comments;
    private final UserId userId;
    private final Title title;
    private final Content content;
    private CreateAndUpdateDate createAndUpdateDate;
    private UseAt useAt;

    public void initializePost() {
        setId(new PostId(UUID.randomUUID()));
        createAndUpdateDate = new CreateAndUpdateDate(LocalDateTime.now(), LocalDateTime.now());
        useAt = new UseAt(true);
    }

    public void validatePost() {

    }


    private Post(Builder builder) {
        comments = builder.comments;
        userId = builder.userId;
        title = builder.title;
        content = builder.content;
        createAndUpdateDate = builder.createAndUpdateDate;
        useAt = builder.useAt;
    }


    public static final class Builder {
        private List<Comment> comments;
        private UserId userId;
        private Title title;
        private Content content;
        private CreateAndUpdateDate createAndUpdateDate;
        private UseAt useAt;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder comments(List<Comment> val) {
            comments = val;
            return this;
        }

        public Builder userId(UserId val) {
            userId = val;
            return this;
        }

        public Builder title(Title val) {
            title = val;
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

        public Post build() {
            return new Post(this);
        }
    }

}
