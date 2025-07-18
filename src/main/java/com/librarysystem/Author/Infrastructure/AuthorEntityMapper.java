package com.librarysystem.Author.Infrastructure;

import com.librarysystem.Author.Domain.Author;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface AuthorEntityMapper {
    AuthorEntity toEntity(Author author);

    Author toDomain(AuthorEntity authorEntity);

    List<AuthorEntity> toEntities(Author[] authors);

    List<Author> toDomains(AuthorEntity[] authorEntities);
}
