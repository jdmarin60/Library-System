package com.librarysystem.loan.infrastructure;

import com.librarysystem.loan.domain.LoanSummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoanSummaryEntityMapper {
    LoanSummary toDomain(LoanEntity loanEntity);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "bookCopy", ignore = true)
    LoanEntity toEntity(LoanSummary loanSummary);


}
