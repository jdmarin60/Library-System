package com.librarysystem.Book.Application;

import com.librarysystem.Book.Domain.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookDTOMapper {
    BookDTO toDTO(Book book);

    Book toDomain(BookDTO bookDTO);

    List<BookDTO> toDTOs(List<Book> books);

    List<Book> toDomains(List<BookDTO> bookDTOS);
}
