package com.librarysystem.author.infrastructure.Repository;

import com.librarysystem.author.domain.Author;
import com.librarysystem.author.domain.AuthorRepository;
import com.librarysystem.author.infrastructure.AuthorEntity;
import com.librarysystem.author.infrastructure.AuthorEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {

    private final AuthorRepositoryJPA authorRepository;
    private final AuthorEntityMapper authorEntityMapper;

    @Override
    public Author save(Author author) {
        if (author == null) {
            return null;
        }
        AuthorEntity authorEntity = authorEntityMapper.toEntity(author);
    return authorEntityMapper.toDomain(authorRepository.save(authorEntity));
    }

    @Override
    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id)
                .map(authorEntityMapper::toDomain);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll().stream()
                .map(authorEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void delete(Author author) {

    }
}
