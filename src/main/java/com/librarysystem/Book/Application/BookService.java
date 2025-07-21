package com.librarysystem.Book.Application;

import java.util.List;
import java.util.Optional;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);

    Optional<BookDTO> getBookById(Long id);

    List<BookDTO> getAllBooks();

    BookDTO updateBook(Long id, BookDTO authorDTO);

    void deleteBook(Long id);
}
