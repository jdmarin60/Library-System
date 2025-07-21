package com.librarysystem.loan.Domain;

import com.librarysystem.bookcopy.domain.BookCopy;
import com.librarysystem.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class Loan {
    private Long id;
    private Date loanDate;
    private Date   dueDate;
    private Date   returnedDate;
    private User user;
    private BookCopy bookCopy;
}
