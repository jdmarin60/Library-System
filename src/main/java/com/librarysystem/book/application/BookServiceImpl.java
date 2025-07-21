package com.librarysystem.book.application;

import com.librarysystem.book.domain.Book;
import com.librarysystem.book.domain.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookDTOMapper bookDTOMapper;

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        if (bookDTO == null) {
            return null;
        }
        Book book = bookDTOMapper.toDomain(bookDTO);
        Book savedBookEntity = bookRepository.save(book);
        return bookDTOMapper.toDTO(savedBookEntity);
    }

    @Override
    public Optional<BookDTO> getBookById(Long id) {
        return bookRepository.findById(id)
                .map(bookDTOMapper::toDTO);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(bookDTOMapper::toDTO)
                .toList();
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        if (bookDTO == null || id == null) {
            return null;
        }
        Optional<Book> existingAuthorOpt = bookRepository.findById(id);
        Book savedBook = null;
        if (existingAuthorOpt.isPresent()) {
            Book existingBook = existingAuthorOpt.get();
            Book updatedBook = bookDTOMapper.toDomain(bookDTO);
            updatedBook.setId(existingBook.getId());
            savedBook = bookRepository.save(updatedBook);

        }
        return bookDTOMapper.toDTO(savedBook);
    }

    @Override
    public void deleteBook(Long id) {
        if (id == null) {
            return;
        }
        bookRepository.deleteById(id);
    }
}
