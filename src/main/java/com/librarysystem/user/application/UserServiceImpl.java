package com.librarysystem.user.application;

import com.librarysystem.user.domain.User;
import com.librarysystem.user.domain.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final AuthorRepository authorRepository;
    private final UserDTOMapper userDTOMapper;

    @Override
    public UserDTO createAuthor(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        User user = userDTOMapper.toDomain(userDTO);
        User savedUserEntity = authorRepository.save(user);
        return userDTOMapper.toDTO(savedUserEntity);
    }

    @Override
    public Optional<UserDTO> getAuthorById(Long id) {
        return authorRepository.findById(id)
                .map(userDTOMapper::toDTO);
    }

    @Override
    public List<UserDTO> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(userDTOMapper::toDTO)
                .toList();
    }

    @Override
    public UserDTO updateAuthor(Long id, UserDTO userDTO) {
        if (userDTO == null || id == null) {
            return null;
        }
        Optional<User> existingAuthorOpt = authorRepository.findById(id);
        User savedUser = null;
        if (existingAuthorOpt.isPresent()) {
            User existingUser = existingAuthorOpt.get();
            User updatedUser = userDTOMapper.toDomain(userDTO);
            updatedUser.setId(existingUser.getId());
            savedUser = authorRepository.save(updatedUser);

        }
        return userDTOMapper.toDTO(savedUser);
    }

    @Override
    public void deleteAuthor(Long id) {
        if (id == null) {
            return;
        }
        authorRepository.deleteById(id);
    }
}
