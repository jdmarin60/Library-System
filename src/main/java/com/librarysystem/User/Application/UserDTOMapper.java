package com.librarysystem.User.Application;

import com.librarysystem.User.Domain.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserDTOMapper {
    UserDTO toDTO(User user);

    User toDomain(UserDTO userDTO);

    List<UserDTO> toDTOs(List<User> users);

    List<User> toDomains(List<UserDTO> userDTOS);
}
