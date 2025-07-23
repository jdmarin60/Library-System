package com.librarysystem.bookcopy.application;

import com.librarysystem.book.application.BookSummaryMapper;
import com.librarysystem.bookcopy.domain.BookCopy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = { BookSummaryMapper.class })
public interface BookCopyDTOMapper {
    BookCopyDTO toDTO(BookCopy bookCopy);

    @Mapping(target = "book.authors", ignore = true)
    @Mapping(target = "book.copies", ignore = true)
    BookCopy toDomain(BookCopyDTO bookCopyDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "book", ignore = true)
    @Mapping(target = "loans", ignore = true)
    BookCopy toDomain(CreateBookCopyDTO createBookCopyDTO);

    List<BookCopyDTO> toDTOs(List<BookCopy> books);

    List<BookCopy> toDomains(List<BookCopyDTO> bookCopyDTOS);
}
