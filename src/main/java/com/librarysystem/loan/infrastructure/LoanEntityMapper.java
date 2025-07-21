package com.librarysystem.loan.infrastructure;

import com.librarysystem.author.infrastructure.AuthorEntityMapper;
import com.librarysystem.book.infrastructure.BookEntityMapper;
import com.librarysystem.loan.domain.Loan;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = { BookEntityMapper.class, AuthorEntityMapper.class})
public interface LoanEntityMapper {
    LoanEntity toEntity(Loan loan);

    Loan toDomain(LoanEntity loanEntity);

    List<LoanEntity> toEntities(Loan[] loans);

    List<Loan> toDomains(LoanEntity[] authorEntities);
}
