package com.librarysystem.User.Application;

import com.librarysystem.Author.Application.AuthorSummaryMapper;
import com.librarysystem.Book.Application.BookSummaryMapper;
import com.librarysystem.BookCopy.Application.BookCopyDTOMapper;
import com.librarysystem.Loan.Application.LoanDTOMapper;
import com.librarysystem.User.Domain.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        BookCopyDTOMapper.class,
        BookSummaryMapper.class,
        AuthorSummaryMapper.class})
public interface UserDTOMapper {
    UserDTO toDTO(User user);

    User toDomain(UserDTO userDTO);

    List<UserDTO> toDTOs(List<User> users);

    List<User> toDomains(List<UserDTO> userDTOS);
}
