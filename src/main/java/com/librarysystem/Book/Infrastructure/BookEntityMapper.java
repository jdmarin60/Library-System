package com.librarysystem.Book.Infrastructure;

import com.librarysystem.Author.Infrastructure.AuthorEntityMapper;
import com.librarysystem.Book.Domain.Book;
import com.librarysystem.BookCopy.Infrastructure.BookCopyEntityMapper;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = { AuthorEntityMapper.class })
public interface BookEntityMapper {
    BookEntity toEntity(Book book);

    Book toDomain(BookEntity bookEntity);

    List<BookEntity> toEntities(Book[] books);

    List<Book> toDomains(BookEntity[] bookEntities);
}
