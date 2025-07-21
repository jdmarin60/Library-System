package com.librarysystem.loan.Infrastructure.Repository;

import com.librarysystem.loan.Infrastructure.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepositoryJPA extends JpaRepository<LoanEntity, Long> {
}
