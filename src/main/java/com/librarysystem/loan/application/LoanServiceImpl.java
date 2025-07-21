package com.librarysystem.loan.application;

import com.librarysystem.loan.domain.Loan;
import com.librarysystem.loan.domain.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;
    private final LoanDTOMapper loanDTOMapper;

    @Override
    public LoanDTO createAuthor(LoanDTO loanDTO) {
        if (loanDTO == null) {
            return null;
        }
        Loan loan = loanDTOMapper.toDomain(loanDTO);
        Loan savedLoanEntity = loanRepository.save(loan);
        return loanDTOMapper.toDTO(savedLoanEntity);
    }

    @Override
    public Optional<LoanDTO> getAuthorById(Long id) {
        return loanRepository.findById(id)
                .map(loanDTOMapper::toDTO);
    }

    @Override
    public List<LoanDTO> getAllAuthors() {
        return loanRepository.findAll().stream()
                .map(loanDTOMapper::toDTO)
                .toList();
    }

    @Override
    public LoanDTO updateAuthor(Long id, LoanDTO loanDTO) {
        if (loanDTO == null || id == null) {
            return null;
        }
        Optional<Loan> existingAuthorOpt = loanRepository.findById(id);
        Loan savedLoan = null;
        if (existingAuthorOpt.isPresent()) {
            Loan existingLoan = existingAuthorOpt.get();
            Loan updatedLoan = loanDTOMapper.toDomain(loanDTO);
            updatedLoan.setId(existingLoan.getId());
            savedLoan = loanRepository.save(updatedLoan);

        }
        return loanDTOMapper.toDTO(savedLoan);
    }

    @Override
    public void deleteAuthor(Long id) {
        if (id == null) {
            return;
        }
        loanRepository.deleteById(id);
    }
}
