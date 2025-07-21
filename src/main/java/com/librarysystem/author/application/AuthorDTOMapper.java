package com.librarysystem.author.application;

import com.librarysystem.author.domain.Author;
import com.librarysystem.book.application.BookSummaryMapper;
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
