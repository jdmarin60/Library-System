package com.librarysystem.author.infrastructure;

import com.librarysystem.author.domain.AuthorSummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AuthorSummaryEntityMapper {
    AuthorSummary toDomain(AuthorEntity authorEntity);

    @Mapping(target = "books", ignore = true)
    AuthorEntity toEntity(AuthorSummary author);
}
