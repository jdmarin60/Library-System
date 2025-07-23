package com.librarysystem.bookcopy.infrastructure;

import com.librarysystem.book.infrastructure.BookSummaryEntityMapper;
import com.librarysystem.bookcopy.domain.BookCopy;
import com.librarysystem.loan.infrastructure.LoanSummaryEntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = { BookSummaryEntityMapper.class, LoanSummaryEntityMapper.class})
public interface BookCopyEntityMapper {
    @Mapping(target = "book", ignore = true)
    @Mapping(target = "loans", ignore = true)
    BookCopyEntity toEntity(BookCopy bookCopy);

    BookCopy toDomain(BookCopyEntity bookCopyEntity);

    List<BookCopyEntity> toEntities(List<BookCopy> booksCopies);

    List<BookCopy> toDomains(List<BookCopyEntity> bookCopyEntities);
}
