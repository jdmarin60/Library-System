package com.librarysystem.BookCopy.Infrastructure;

import com.librarysystem.Author.Infrastructure.AuthorEntityMapper;
import com.librarysystem.Book.Domain.Book;
import com.librarysystem.Book.Infrastructure.BookEntityMapper;
import com.librarysystem.BookCopy.Domain.BookCopy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = { BookEntityMapper.class, AuthorEntityMapper.class})
public interface BookCopyEntityMapper {
    BookCopyEntity toEntity(BookCopy bookCopy);

    BookCopy toDomain(BookCopyEntity bookCopyEntity);

    List<BookCopyEntity> toEntities(List<BookCopy> booksCopies);

    List<BookCopy> toDomains(List<BookCopyEntity> bookCopyEntities);
}
