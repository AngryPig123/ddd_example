package com.food.ordering.system.domain.valueobject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class CreateAndUpdateDate {

    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public CreateAndUpdateDate(LocalDateTime createDate, LocalDateTime updateDate) {
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAndUpdateDate that = (CreateAndUpdateDate) o;
        return Objects.equals(getCreateDate(), that.getCreateDate()) && Objects.equals(getUpdateDate(), that.getUpdateDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreateDate(), getUpdateDate());
    }
    
}
