package com.librarysystem.loan.application;

import com.librarysystem.bookcopy.application.BookCopyDTO;
import com.librarysystem.user.application.UserDTO;

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
    private UserDTO user;
    private BookCopyDTO bookCopy;
}
