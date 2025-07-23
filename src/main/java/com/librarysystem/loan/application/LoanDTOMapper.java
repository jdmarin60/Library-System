package com.librarysystem.loan.application;

import com.librarysystem.author.application.AuthorSummaryMapper;
import com.librarysystem.book.application.BookSummaryMapper;
import com.librarysystem.bookcopy.application.BookCopyDTOMapper;
import com.librarysystem.loan.domain.Loan;
import com.librarysystem.user.application.UserDTOMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        UserDTOMapper.class,
        BookCopyDTOMapper.class,
        BookSummaryMapper.class,
        AuthorSummaryMapper.class
})
public interface LoanDTOMapper {
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "bookCopy", ignore = true)
    LoanDTO toDTO(Loan loan);

    Loan toDomain(LoanDTO loanDTO);

    List<LoanDTO> toDTOs(List<Loan> loans);

    List<Loan> toDomains(List<LoanDTO> loanDTOS);
}
