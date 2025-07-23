package com.librarysystem.user.application;

import com.librarysystem.loan.application.LoanDTOMapper;
import com.librarysystem.user.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        LoanDTOMapper.class})
public interface UserDTOMapper {
    UserDTO toDTO(User user);

    User toDomain(UserDTO userDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "borrowedBooks", ignore = true)
    User toDomain(CreateUserDTO createUserDTO);

    List<UserDTO> toDTOs(List<User> users);

    List<User> toDomains(List<UserDTO> userDTOS);
}
