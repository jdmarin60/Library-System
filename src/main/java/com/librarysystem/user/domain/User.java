package com.librarysystem.user.domain;

import com.librarysystem.loan.domain.Loan;
import com.librarysystem.security.domain.Role;
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
    private String password;
    private String libraryId;
    private Role role;
    private boolean enabled;
    private List<Loan> borrowedBooks;
}
