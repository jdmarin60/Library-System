package com.librarysystem.bookcopy.application;

import com.librarysystem.bookcopy.domain.BookCopy;
import com.librarysystem.bookcopy.domain.BookCopySummary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookCopySummaryMapper {
    BookCopySummary toDTO(BookCopy bookCopy);
}
