package com.librarysystem.book.infrastructure.Repository;

import com.librarysystem.book.domain.Book;
import com.librarysystem.book.domain.BookRepository;
import com.librarysystem.book.infrastructure.BookEntity;
import com.librarysystem.book.infrastructure.BookEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookRepositoryJPA authorRepository;
    private final BookEntityMapper bookEntityMapper;

    @Override
    public Book save(Book book) {
        if (book == null) {
            return null;
        }
        BookEntity bookEntity = bookEntityMapper.toEntity(book);
    return bookEntityMapper.toDomain(authorRepository.save(bookEntity));
    }

    @Override
    public Optional<Book> findById(Long id) {
        return authorRepository.findById(id)
                .map(bookEntityMapper::toDomain);
    }

    @Override
    public List<Book> findAll() {
        return authorRepository.findAll().stream()
                .map(bookEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void delete(Book book) {

    }
}
