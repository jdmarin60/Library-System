package com.librarysystem.bookcopy.infrastructure;

import com.librarysystem.bookcopy.domain.BookCopySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookCopySummaryEntityMapper {

    @Mapping(target = "books", ignore = true)
    @Mapping(target = "loans", ignore = true)
    BookCopySummary toDomain(BookCopyEntity bookCopyEntity);

    BookCopyEntity toEntity(BookCopySummary bookCopySummary);


}
