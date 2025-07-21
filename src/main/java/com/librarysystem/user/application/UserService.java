package com.librarysystem.user.application;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO createAuthor(UserDTO userDTO);

    Optional<UserDTO> getAuthorById(Long id);

    List<UserDTO> getAllAuthors();

    UserDTO updateAuthor(Long id, UserDTO userDTO);

    void deleteAuthor(Long id);
}
