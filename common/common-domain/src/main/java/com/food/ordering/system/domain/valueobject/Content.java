package com.food.ordering.system.domain.valueobject;

import java.util.Objects;

public class Content {

    private final String detail;
    private final ContentType contentType;

    public Content(String detail, ContentType contentType) {
        this.detail = detail;
        this.contentType = contentType;
    }

    public String getDetail() {
        return detail;
    }

    public ContentType getContentType() {
        return contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(getDetail(), content.getDetail()) && getContentType() == content.getContentType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDetail(), getContentType());
    }

}
