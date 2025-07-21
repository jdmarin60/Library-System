package com.librarysystem.Author.Infrastructure;

import com.librarysystem.Author.Domain.AuthorSummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorSummaryEntityMapper {
    AuthorSummary toDomain(AuthorEntity authorEntity);

    @Mapping(target = "books", ignore = true)
    AuthorEntity toEntity(AuthorSummary author);
}
