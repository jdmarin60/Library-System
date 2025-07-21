package com.librarysystem.loan.infrastructure.Repository;

import com.librarysystem.loan.infrastructure.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepositoryJPA extends JpaRepository<LoanEntity, Long> {
}
