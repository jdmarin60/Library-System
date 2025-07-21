package com.librarysystem.bookcopy.application;

import com.librarysystem.bookcopy.domain.BookCopy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookCopyDTOMapper {
    BookCopyDTO toDTO(BookCopy bookCopy);

    @Mapping(target = "book.authors", ignore = true)
    @Mapping(target = "book.copies", ignore = true)
    BookCopy toDomain(BookCopyDTO bookCopyDTO);

    List<BookCopyDTO> toDTOs(List<BookCopy> books);

    List<BookCopy> toDomains(List<BookCopyDTO> bookCopyDTOS);
}
