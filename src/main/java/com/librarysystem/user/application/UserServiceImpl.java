package com.librarysystem.user.application;

import com.librarysystem.security.infrastructure.SecurityConfig;
import com.librarysystem.user.domain.User;
import com.librarysystem.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserDTOMapper userDTOMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDTO createAuthor(CreateUserDTO createUserDTO) {
        if (createUserDTO == null) {
            return null;
        }
        User user = userDTOMapper.toDomain(createUserDTO);
        String encodedPassword = passwordEncoder.encode(createUserDTO.getPassword());
        user.setPassword(encodedPassword);
        User savedUserEntity = userRepository.save(user);
        return userDTOMapper.toDTO(savedUserEntity);
    }

    @Override
    public Optional<UserDTO> getAuthorById(Long id) {
        return userRepository.findById(id)
                .map(userDTOMapper::toDTO);
    }

    @Override
    public List<UserDTO> getAllAuthors() {
        return userRepository.findAll().stream()
                .map(userDTOMapper::toDTO)
                .toList();
    }

    @Override
    public UserDTO updateAuthor(Long id, UserDTO userDTO) {
        if (userDTO == null || id == null) {
            return null;
        }
        Optional<User> existingAuthorOpt = userRepository.findById(id);
        User savedUser = null;
        if (existingAuthorOpt.isPresent()) {
            User existingUser = existingAuthorOpt.get();
            User updatedUser = userDTOMapper.toDomain(userDTO);
            updatedUser.setId(existingUser.getId());
            savedUser = userRepository.save(updatedUser);

        }
        return userDTOMapper.toDTO(savedUser);
    }

    @Override
    public void deleteAuthor(Long id) {
        if (id == null) {
            return;
        }
        userRepository.deleteById(id);
    }
}
