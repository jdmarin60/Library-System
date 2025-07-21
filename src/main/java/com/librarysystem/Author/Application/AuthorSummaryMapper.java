package com.librarysystem.Author.Application;

import com.librarysystem.Author.Domain.Author;
import com.librarysystem.Author.Domain.AuthorSummary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorSummaryMapper {
    AuthorSummary toSummaryDTO(Author author);
}
