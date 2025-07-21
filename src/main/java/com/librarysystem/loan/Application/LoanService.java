package com.librarysystem.loan.Application;

import java.util.List;
import java.util.Optional;

public interface LoanService {
    LoanDTO createAuthor(LoanDTO loanDTO);

    Optional<LoanDTO> getAuthorById(Long id);

    List<LoanDTO> getAllAuthors();

    LoanDTO updateAuthor(Long id, LoanDTO loanDTO);

    void deleteAuthor(Long id);
}
