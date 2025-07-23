package com.librarysystem.book.infrastructure;

import com.librarysystem.author.infrastructure.AuthorSummaryEntityMapper;
import com.librarysystem.book.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = { AuthorSummaryEntityMapper.class })
public interface BookEntityMapper {

    @Mapping(target = "copies", ignore = true)
    @Mapping(target = "authors", ignore = true)
    BookEntity toEntity(Book book);

    Book toDomain(BookEntity bookEntity);

    List<BookEntity> toEntities(Book[] books);

    List<Book> toDomains(BookEntity[] bookEntities);
}
