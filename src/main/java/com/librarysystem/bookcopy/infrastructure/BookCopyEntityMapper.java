package com.librarysystem.bookcopy.infrastructure;

import com.librarysystem.author.infrastructure.AuthorEntityMapper;
import com.librarysystem.book.infrastructure.BookEntityMapper;
import com.librarysystem.bookcopy.domain.BookCopy;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = { BookEntityMapper.class, AuthorEntityMapper.class})
public interface BookCopyEntityMapper {
    BookCopyEntity toEntity(BookCopy bookCopy);

    BookCopy toDomain(BookCopyEntity bookCopyEntity);

    List<BookCopyEntity> toEntities(List<BookCopy> booksCopies);

    List<BookCopy> toDomains(List<BookCopyEntity> bookCopyEntities);
}
