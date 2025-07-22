package com.librarysystem.user.domain;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User>  findById(Long id);

    Optional<User>  findByName(String username);

    List<User> findAll();

    void deleteById(Long id);

    void delete(User user);
}
