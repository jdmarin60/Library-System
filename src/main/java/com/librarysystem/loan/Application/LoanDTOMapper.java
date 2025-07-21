package com.librarysystem.loan.Application;

import com.librarysystem.author.application.AuthorSummaryMapper;
import com.librarysystem.book.application.BookSummaryMapper;
import com.librarysystem.bookcopy.application.BookCopyDTOMapper;
import com.librarysystem.loan.Domain.Loan;
import com.librarysystem.user.application.UserDTOMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        UserDTOMapper.class,
        BookCopyDTOMapper.class,
        BookSummaryMapper.class,
        AuthorSummaryMapper.class
})
public interface LoanDTOMapper {
    LoanDTO toDTO(Loan loan);

    Loan toDomain(LoanDTO loanDTO);

    List<LoanDTO> toDTOs(List<Loan> loans);

    List<Loan> toDomains(List<LoanDTO> loanDTOS);
}
