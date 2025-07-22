package com.librarysystem.user.infrastructure.Repository;

import com.librarysystem.user.domain.User;
import com.librarysystem.user.domain.UserRepository;
import com.librarysystem.user.infrastructure.UserEntity;
import com.librarysystem.user.infrastructure.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJPA userRepositoryJPA;
    private final UserEntityMapper userEntityMapper;

    @Override
    public User save(User user) {
        if (user == null) {
            return null;
        }
        UserEntity userEntity = userEntityMapper.toEntity(user);
    return userEntityMapper.toDomain(userRepositoryJPA.save(userEntity));
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepositoryJPA.findById(id)
                .map(userEntityMapper::toDomain);
    }

    @Override
    public Optional<User> findByName(String username) {
        return userRepositoryJPA.findByName(username)
                .map(userEntityMapper::toDomain);
    }

    @Override
    public List<User> findAll() {
        return userRepositoryJPA.findAll().stream()
                .map(userEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        userRepositoryJPA.deleteById(id);
    }

    @Override
    public void delete(User user) {

    }
}
