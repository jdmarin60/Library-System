package com.librarysystem.Book.Infrastructure;

import com.librarysystem.Book.Domain.BookSummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookSummaryEntityMapper {
    @Mapping(target = "copies", expression = "java(bookEntity.getCopies() != null ? bookEntity.getCopies().size() : 0)")
    BookSummary toDomain(BookEntity bookEntity);
}
