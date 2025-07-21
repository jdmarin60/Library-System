package com.librarysystem.Book.Domain;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Book save(Book book);

    Optional<Book>  findById(Long id);

    List<Book> findAll();

    void deleteById(Long id);

    void delete(Book book);
}
