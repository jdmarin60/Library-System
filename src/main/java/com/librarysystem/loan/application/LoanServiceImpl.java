package com.librarysystem.loan.application;

import com.librarysystem.loan.domain.Loan;
import com.librarysystem.loan.domain.LoanRepository;
import com.librarysystem.notification.domain.Notification;
import com.librarysystem.notification.domain.NotificationService;
import com.librarysystem.user.application.UserDTO;
import com.librarysystem.user.application.UserDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;
    private final LoanDTOMapper loanDTOMapper;
    private final UserDTOMapper userDTOMapper;
    private  final NotificationService notificationService;

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
    public List<UserDTO> getOverdueUsers() {
        return List.of();
    }

//    @Override
//    public List<UserDTO> getOverdueUsers() {
//        List<UserDTO> overdueUsers = loanRepository.getOverdueUsers().stream()
//                .map(Loan::getUser)
//                .distinct()
//                .map(userDTOMapper::toDTO)
//                .toList();
//
//        for (UserDTO user : overdueUsers) {
//            Notification notification = new Notification("You have overdue books. Please return them as soon as possible.");
//            notificationService.send(notification);
//        }
//        return overdueUsers;
//    }

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
