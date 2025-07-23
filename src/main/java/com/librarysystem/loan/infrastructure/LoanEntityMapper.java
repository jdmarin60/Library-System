package com.librarysystem.loan.infrastructure;

import com.librarysystem.bookcopy.infrastructure.BookCopyEntityMapper;
import com.librarysystem.loan.domain.Loan;
import com.librarysystem.user.infrastructure.UserSummaryEntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = { BookCopyEntityMapper.class, UserSummaryEntityMapper.class})
public interface LoanEntityMapper {

    @Mapping(target = "bookCopy.book", ignore = true)
    @Mapping(target = "bookCopy.loans", ignore = true)
    LoanEntity toEntity(Loan loan);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "bookCopy", ignore = true)
    Loan toDomain(LoanEntity loanEntity);

    List<LoanEntity> toEntities(Loan[] loans);

    List<Loan> toDomains(LoanEntity[] authorEntities);
}
