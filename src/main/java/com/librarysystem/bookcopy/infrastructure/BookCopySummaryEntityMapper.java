package com.librarysystem.bookcopy.infrastructure;

import com.librarysystem.bookcopy.domain.BookCopySummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookCopySummaryEntityMapper {

    BookCopySummary toDomain(BookCopyEntity bookCopyEntity);

    @Mapping(target = "book", ignore = true)
    @Mapping(target = "loans", ignore = true)
    BookCopyEntity toEntity(BookCopySummary bookCopySummary);


}
