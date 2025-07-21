package com.librarysystem.author.domain;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {
    Author save(Author author);

    Optional<Author>  findById(Long id);

    List<Author> findAll();

    void deleteById(Long id);

    void delete(Author author);
}
