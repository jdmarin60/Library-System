package com.librarysystem.Author.Application;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    AuthorDTO createAuthor(CreateAuthorDTO createAuthorDTO);

    Optional<AuthorDTO> getAuthorById(Long id);

    List<AuthorDTO> getAllAuthors();

    AuthorDTO updateAuthor(Long id, AuthorDTO authorDTO);

    void deleteAuthor(Long id);
}
