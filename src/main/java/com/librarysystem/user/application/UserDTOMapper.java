package com.librarysystem.user.application;

import com.librarysystem.author.application.AuthorSummaryMapper;
import com.librarysystem.book.application.BookSummaryMapper;
import com.librarysystem.bookcopy.application.BookCopyDTOMapper;
import com.librarysystem.user.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        BookCopyDTOMapper.class,
        BookSummaryMapper.class,
        AuthorSummaryMapper.class})
public interface UserDTOMapper {
    UserDTO toDTO(User user);

    User toDomain(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "borrowedBooks", ignore = true)
    User toDomain(CreateUserDTO createUserDTO);

    List<UserDTO> toDTOs(List<User> users);

    List<User> toDomains(List<UserDTO> userDTOS);
}
