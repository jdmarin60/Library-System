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

    private final BookCopyRepositoryJPA bookCopyRepository;
    private final BookCopyEntityMapper bookCopyEntityMapper;

    @Override
    public BookCopy save(BookCopy bookCopy) {
        if (bookCopy == null) {
            return null;
        }
        BookCopyEntity bookCopyEntity = bookCopyEntityMapper.toEntity(bookCopy);
    return bookCopyEntityMapper.toDomain(bookCopyRepository.save(bookCopyEntity));
    }

    @Override
    public Optional<BookCopy> findById(Long id) {
        return bookCopyRepository.findById(id)
                .map(bookCopyEntityMapper::toDomain);
    }

    @Override
    public List<BookCopy> findAll() {
        return bookCopyRepository.findAll().stream()
                .map(bookCopyEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        bookCopyRepository.deleteById(id);
    }

    @Override
    public void delete(BookCopy bookCopy) {

    }
}
