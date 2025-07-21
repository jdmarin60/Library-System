package com.librarysystem.user.domain;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {
    User save(User user);

    Optional<User>  findById(Long id);

    List<User> findAll();

    void deleteById(Long id);

    void delete(User user);
}
