package com.librarysystem.bookcopy.application;

import java.util.List;
import java.util.Optional;

public interface BookCopyService {
    BookCopyDTO createBookCopy(BookCopyDTO bookCopyDTO);

    Optional<BookCopyDTO> getBookCopyById(Long id);

    List<BookCopyDTO> getAllBooks();

    BookCopyDTO updateBookCopy(Long id, BookCopyDTO bookCopyDTO);

    void deleteBookCopy(Long id);
}
