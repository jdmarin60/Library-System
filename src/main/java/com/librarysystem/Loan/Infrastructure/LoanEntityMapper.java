package com.librarysystem.Loan.Infrastructure;

import com.librarysystem.Author.Infrastructure.AuthorEntityMapper;
import com.librarysystem.Book.Infrastructure.BookEntityMapper;
import com.librarysystem.Loan.Domain.Loan;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = { BookEntityMapper.class, AuthorEntityMapper.class})
public interface LoanEntityMapper {
    LoanEntity toEntity(Loan loan);

    Loan toDomain(LoanEntity loanEntity);

    List<LoanEntity> toEntities(Loan[] loans);

    List<Loan> toDomains(LoanEntity[] authorEntities);
}
