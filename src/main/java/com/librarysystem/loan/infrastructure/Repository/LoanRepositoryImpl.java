package com.librarysystem.loan.infrastructure.Repository;

import com.librarysystem.loan.application.LoanDTO;
import com.librarysystem.loan.domain.Loan;
import com.librarysystem.loan.domain.LoanRepository;
import com.librarysystem.loan.infrastructure.LoanEntity;
import com.librarysystem.loan.infrastructure.LoanEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class LoanRepositoryImpl implements LoanRepository {

    private final LoanRepositoryJPA loanRepository;
    private final LoanEntityMapper loanEntityMapper;

    @Override
    public Loan save(Loan loan) {
        if (loan == null) {
            return null;
        }
        LoanEntity loanEntity = loanEntityMapper.toEntity(loan);
    return loanEntityMapper.toDomain(loanRepository.save(loanEntity));
    }

    @Override
    public Optional<Loan> findById(Long id) {
        return loanRepository.findById(id)
                .map(loanEntityMapper::toDomain);
    }

    @Override
    public List<Loan> findAll() {
        return loanRepository.findAll().stream()
                .map(loanEntityMapper::toDomain)
                .toList();
    }

    @Override
    public List<Loan> getOverdueUsers() {
        return List.of();
    }

//    @Override
//    public List<Loan> getOverdueUsers() {
//        return loanRepository
//                .findByReturnedDateIsNullAndDueDateBefore(new Date())
//                .stream()
//                .map(loanEntityMapper::toDomain)
//                .toList();
//    }

    @Override
    public void deleteById(Long id) {
        loanRepository.deleteById(id);
    }

    @Override
    public void delete(Loan loan) {

    }
}
