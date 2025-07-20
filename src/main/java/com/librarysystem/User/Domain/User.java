package com.librarysystem.User.Domain;

import com.librarysystem.Loan.Domain.Loan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class User {
    private Long id;
    private String name;
    private String email;
    private String libraryId;
    private String role;
    private List<Loan> borrowedBooks;
}
