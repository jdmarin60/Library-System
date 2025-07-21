package com.librarysystem.author.application;

import com.librarysystem.author.domain.Author;
import com.librarysystem.author.domain.AuthorSummary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorSummaryMapper {
    AuthorSummary toSummaryDTO(Author author);
}
