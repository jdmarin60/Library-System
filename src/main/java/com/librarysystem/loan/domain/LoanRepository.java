package com.librarysystem.loan.domain;

import com.librarysystem.loan.application.LoanDTO;

import java.util.List;
import java.util.Optional;

public interface LoanRepository {
    Loan save(Loan loan);

    Optional<Loan>  findById(Long id);

    List<Loan> findAll();

    List<Loan> getOverdueUsers();

    void deleteById(Long id);

    void delete(Loan loan);
}
