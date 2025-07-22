package com.librarysystem.security.domain.interfaces;

import com.librarysystem.user.domain.User;
import com.librarysystem.user.infrastructure.UserEntity;

import java.util.Optional;

public interface AuthRepository {
    Optional<User> findByName(String username);
    Optional<User> findByEmail(String email);
}
