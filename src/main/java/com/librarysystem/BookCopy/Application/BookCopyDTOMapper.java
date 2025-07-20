package com.librarysystem.BookCopy.Application;

import com.librarysystem.BookCopy.Domain.BookCopy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookCopyDTOMapper {
    BookCopyDTO toDTO(BookCopy bookCopy);

    BookCopy toDomain(BookCopyDTO bookCopyDTO);

    List<BookCopyDTO> toDTOs(List<BookCopy> books);

    List<BookCopy> toDomains(List<BookCopyDTO> bookCopyDTOS);
}
