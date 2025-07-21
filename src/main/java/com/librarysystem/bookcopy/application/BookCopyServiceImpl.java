package com.librarysystem.bookcopy.application;

import com.librarysystem.bookcopy.domain.BookCopy;
import com.librarysystem.bookcopy.domain.BookCopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookCopyServiceImpl implements BookCopyService {

    private final BookCopyRepository bookCopyRepository;
    private final BookCopyDTOMapper bookCopyDTOMapper;

    @Override
    public BookCopyDTO createBookCopy(BookCopyDTO bookCopyDTO) {
        if (bookCopyDTO == null) {
            return null;
        }
        BookCopy book = bookCopyDTOMapper.toDomain(bookCopyDTO);
        BookCopy savedBookEntity = bookCopyRepository.save(book);
        return bookCopyDTOMapper.toDTO(savedBookEntity);
    }

    @Override
    public Optional<BookCopyDTO> getBookCopyById(Long id) {
        return bookCopyRepository.findById(id)
                .map(bookCopyDTOMapper::toDTO);
    }

    @Override
    public List<BookCopyDTO> getAllBooks() {
        return bookCopyRepository.findAll().stream()
                .map(bookCopyDTOMapper::toDTO)
                .toList();
    }

    @Override
    public BookCopyDTO updateBookCopy(Long id, BookCopyDTO bookCopyDTO) {
        if (bookCopyDTO == null || id == null) {
            return null;
        }
        Optional<BookCopy> existingAuthorOpt = bookCopyRepository.findById(id);
        BookCopy savedBook = null;
        if (existingAuthorOpt.isPresent()) {
            BookCopy existingBook = existingAuthorOpt.get();
            BookCopy updatedBook = bookCopyDTOMapper.toDomain(bookCopyDTO);
            updatedBook.setId(existingBook.getId());
            savedBook = bookCopyRepository.save(updatedBook);

        }
        return bookCopyDTOMapper.toDTO(savedBook);
    }

    @Override
    public void deleteBookCopy(Long id) {
        if (id == null) {
            return;
        }
        bookCopyRepository.deleteById(id);
    }
}
