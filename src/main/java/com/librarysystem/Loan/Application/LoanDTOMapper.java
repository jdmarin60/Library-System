package com.librarysystem.Loan.Application;

import com.librarysystem.Loan.Domain.Loan;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LoanDTOMapper {
    LoanDTO toDTO(Loan loan);

    Loan toDomain(LoanDTO loanDTO);

    List<LoanDTO> toDTOs(List<Loan> loans);

    List<Loan> toDomains(List<LoanDTO> loanDTOS);
}
