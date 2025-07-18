package com.librarysystem.Author.Application;

import com.librarysystem.Author.Domain.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorDTOMapper {
    AuthorDTO toDTO(Author author);

    Author toDomain(AuthorDTO authorDTO);

    List<AuthorDTO> toDTOs(List<Author> authors);

    List<Author> toDomains(List<AuthorDTO> authorDTOs);
}
