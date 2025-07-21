package com.librarysystem.BookCopy.Domain;

import java.util.List;
import java.util.Optional;

public interface BookCopyRepository {
    BookCopy save(BookCopy bookCopy);

    Optional<BookCopy>  findById(Long id);

    List<BookCopy> findAll();

    void deleteById(Long id);

    void delete(BookCopy bookCopy);
}
