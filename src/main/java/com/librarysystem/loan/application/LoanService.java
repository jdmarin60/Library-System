package com.librarysystem.loan.application;

import com.librarysystem.user.application.UserDTO;

import java.util.List;
import java.util.Optional;

public interface LoanService {
    LoanDTO createAuthor(LoanDTO loanDTO);

    Optional<LoanDTO> getAuthorById(Long id);

    List<LoanDTO> getAllAuthors();

    List<UserDTO> getOverdueUsers();

    LoanDTO updateAuthor(Long id, LoanDTO loanDTO);

    void deleteAuthor(Long id);
}
