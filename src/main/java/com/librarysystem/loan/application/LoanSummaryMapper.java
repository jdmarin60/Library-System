package com.librarysystem.loan.application;

import com.librarysystem.loan.domain.Loan;
import com.librarysystem.loan.domain.LoanSummary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoanSummaryMapper {
    LoanSummary toSummaryDTO(Loan loan);
}
