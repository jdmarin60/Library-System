package com.librarysystem.book.application;

import com.librarysystem.author.application.AuthorSummaryMapper;
import com.librarysystem.book.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = { AuthorSummaryMapper.class, BookSummaryMapper.class })
public interface BookDTOMapper {
    BookDTO toDTO(Book book);

    @Mapping(target = "copies", ignore = true)
    @Mapping(target = "authors", ignore = true)
    Book toDomain(BookDTO bookDTO);

    List<BookDTO> toDTOs(List<Book> books);

    List<Book> toDomains(List<BookDTO> bookDTOS);
}
