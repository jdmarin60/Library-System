package com.librarysystem.Loan.Infrastructure.Repository;

import com.librarysystem.Loan.Infrastructure.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepositoryJPA extends JpaRepository<LoanEntity, Long> {
}
