package com.librarysystem.loan.application;

import com.librarysystem.bookcopy.application.BookCopyDTO;
import com.librarysystem.bookcopy.domain.BookCopySummary;
import com.librarysystem.user.application.UserDTO;

import com.librarysystem.user.domain.UserSummary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class LoanDTO {
    private Long id;
    private Date loanDate;
    private Date   dueDate;
    private Date   returnedDate;
    @Builder.Default
    private UserSummary user = new UserSummary();
    @Builder.Default
    private BookCopySummary bookCopySummary = new BookCopySummary();
}
