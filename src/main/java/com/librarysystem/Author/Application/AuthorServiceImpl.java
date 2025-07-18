package com.librarysystem.Author.Application;

import com.librarysystem.Author.Domain.Author;
import com.librarysystem.Author.Domain.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl  implements  AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorDTOMapper authorDTOMapper;

    @Override
    public AuthorDTO createAuthor(AuthorDTO authorDTO) {
        if (authorDTO == null) {
            return null;
        }
        Author author = authorDTOMapper.toDomain(authorDTO);
        Author savedAuthorEntity = authorRepository.save(author);
        return authorDTOMapper.toDTO(savedAuthorEntity);
    }

    @Override
    public Optional<AuthorDTO> getAuthorById(Long id) {
        return authorRepository.findById(id)
                .map(authorDTOMapper::toDTO);
    }

    @Override
    public List<AuthorDTO> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(authorDTOMapper::toDTO)
                .toList();
    }

    @Override
    public AuthorDTO updateAuthor(Long id, AuthorDTO authorDTO) {
        if (authorDTO == null || id == null) {
            return null;
        }
        Optional<Author> existingAuthorOpt = authorRepository.findById(id);
        Author savedAuthor = null;
        if (existingAuthorOpt.isPresent()) {
            Author existingAuthor = existingAuthorOpt.get();
            Author updatedAuthor = authorDTOMapper.toDomain(authorDTO);
            updatedAuthor.setId(existingAuthor.getId());
            savedAuthor = authorRepository.save(updatedAuthor);

        }
        return authorDTOMapper.toDTO(savedAuthor);
    }

    @Override
    public void deleteAuthor(Long id) {
        if (id == null) {
            return;
        }
        authorRepository.deleteById(id);
    }
}
