package com.librarysystem.loan.infrastructure.Repository;

import com.librarysystem.loan.infrastructure.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface LoanRepositoryJPA extends JpaRepository<LoanEntity, Long> {
    List<LoanEntity> findByReturnedDateIsNullAndDueDateBefore(Date date);
}
