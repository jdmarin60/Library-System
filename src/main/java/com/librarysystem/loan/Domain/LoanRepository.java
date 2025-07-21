package com.librarysystem.loan.Domain;

import java.util.List;
import java.util.Optional;

public interface LoanRepository {
    Loan save(Loan loan);

    Optional<Loan>  findById(Long id);

    List<Loan> findAll();

    void deleteById(Long id);

    void delete(Loan loan);
}
