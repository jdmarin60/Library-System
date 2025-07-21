package com.librarysystem.Author.Application;

import com.librarysystem.Author.Domain.Author;
import com.librarysystem.Book.Application.BookSummaryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = BookSummaryMapper.class)
public interface AuthorDTOMapper {
    AuthorDTO toDTO(Author author);

    Author toDomain(AuthorDTO authorDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "books", ignore = true)
    Author toDomain(CreateAuthorDTO createAuthorDTO);

    List<AuthorDTO> toDTOs(List<Author> authors);

    List<Author> toDomains(List<AuthorDTO> authorDTOs);
}
