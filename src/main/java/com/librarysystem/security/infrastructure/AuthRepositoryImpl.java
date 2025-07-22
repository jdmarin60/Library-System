package com.librarysystem.security.infrastructure;

import com.librarysystem.security.domain.interfaces.AuthRepository;
import com.librarysystem.user.domain.User;
import com.librarysystem.user.infrastructure.Repository.UserRepositoryJPA;
import com.librarysystem.user.infrastructure.UserEntity;
import com.librarysystem.user.infrastructure.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AuthRepositoryImpl implements AuthRepository {

    private final UserRepositoryJPA userRepositoryJPA;
    private final UserEntityMapper userEntityMapper;

    @Override
    public Optional<User> findByName(String username) {
        return userRepositoryJPA.findByName(username)
                .map(userEntityMapper::toDomain);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepositoryJPA.findByEmail(email)
                .map(userEntityMapper::toDomain);
    }
}
