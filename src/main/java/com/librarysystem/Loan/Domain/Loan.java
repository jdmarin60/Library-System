package com.librarysystem.Loan.Domain;

import com.librarysystem.BookCopy.Domain.BookCopy;
import com.librarysystem.User.Domain.User;
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
