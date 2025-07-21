package com.librarysystem.bookcopy.infrastructure.Repository;

import com.librarysystem.bookcopy.domain.BookCopy;
import com.librarysystem.bookcopy.domain.BookCopyRepository;
import com.librarysystem.bookcopy.infrastructure.BookCopyEntity;
import com.librarysystem.bookcopy.infrastructure.BookCopyEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BookCopyRepositoryImpl implements BookCopyRepository {

    private final BookCopyRepositoryJPA authorRepository;
    private final BookCopyEntityMapper bookCopyEntityMapper;

    @Override
    public BookCopy save(BookCopy bookCopy) {
        if (bookCopy == null) {
            return null;
        }
        BookCopyEntity bookCopyEntity = bookCopyEntityMapper.toEntity(bookCopy);
    return bookCopyEntityMapper.toDomain(authorRepository.save(bookCopyEntity));
    }

    @Override
    public Optional<BookCopy> findById(Long id) {
        return authorRepository.findById(id)
                .map(bookCopyEntityMapper::toDomain);
    }

    @Override
    public List<BookCopy> findAll() {
        return authorRepository.findAll().stream()
                .map(bookCopyEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void delete(BookCopy bookCopy) {

    }
}
