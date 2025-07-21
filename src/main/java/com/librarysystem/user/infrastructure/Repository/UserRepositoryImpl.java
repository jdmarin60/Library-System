package com.librarysystem.user.infrastructure.Repository;

import com.librarysystem.user.domain.User;
import com.librarysystem.user.domain.AuthorRepository;
import com.librarysystem.user.infrastructure.UserEntity;
import com.librarysystem.user.infrastructure.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements AuthorRepository {

    private final UserRepositoryJPA authorRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public User save(User user) {
        if (user == null) {
            return null;
        }
        UserEntity userEntity = userEntityMapper.toEntity(user);
    return userEntityMapper.toDomain(authorRepository.save(userEntity));
    }

    @Override
    public Optional<User> findById(Long id) {
        return authorRepository.findById(id)
                .map(userEntityMapper::toDomain);
    }

    @Override
    public List<User> findAll() {
        return authorRepository.findAll().stream()
                .map(userEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void delete(User user) {

    }
}
