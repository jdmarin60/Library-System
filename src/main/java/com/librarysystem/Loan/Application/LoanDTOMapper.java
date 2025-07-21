package com.librarysystem.Loan.Application;

import com.librarysystem.Author.Application.AuthorSummaryMapper;
import com.librarysystem.Book.Application.BookSummaryMapper;
import com.librarysystem.BookCopy.Application.BookCopyDTOMapper;
import com.librarysystem.Loan.Domain.Loan;
import com.librarysystem.User.Application.UserDTOMapper;
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
