package com.librarysystem.book.application;

import com.librarysystem.book.domain.Book;
import com.librarysystem.book.domain.BookSummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookSummaryMapper {
    @Mapping(target = "copies", expression = "java(book.getCopies() != null ? book.getCopies().size() : 0)")
    BookSummary toDTO(Book book);

    @Mapping(target = "authors", ignore = true)
    @Mapping(target = "copies", ignore = true)
    Book toDomain(BookSummary dto);
}
