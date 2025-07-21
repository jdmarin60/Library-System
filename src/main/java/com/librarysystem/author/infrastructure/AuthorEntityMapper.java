package com.librarysystem.author.infrastructure;

import com.librarysystem.author.domain.Author;
import com.librarysystem.book.infrastructure.BookSummaryEntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = {BookSummaryEntityMapper.class})
public interface AuthorEntityMapper {
    @Mapping(target = "books", ignore = true)
    AuthorEntity toEntity(Author author);

    Author toDomain(AuthorEntity authorEntity);

    List<AuthorEntity> toEntities(Author[] authors);

    List<Author> toDomains(AuthorEntity[] authorEntities);
}
