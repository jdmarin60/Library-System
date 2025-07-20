package com.librarysystem.User.Application;

import com.librarysystem.Loan.Application.LoanDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String libraryId;
    private String role;
    private List<LoanDTO> borrowedBooks;
}
