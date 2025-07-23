package com.librarysystem.loan.application;

import com.librarysystem.bookcopy.application.BookCopySummaryMapper;
import com.librarysystem.loan.domain.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        BookCopySummaryMapper.class
})
public interface LoanDTOMapper {
    @Mapping(target = "user", ignore = true)
    LoanDTO toDTO(Loan loan);

    Loan toDomain(LoanDTO loanDTO);

    List<LoanDTO> toDTOs(List<Loan> loans);

    List<Loan> toDomains(List<LoanDTO> loanDTOS);
}
