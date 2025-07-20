package com.librarysystem.User.Infrastructure;

import com.librarysystem.Loan.Infrastructure.LoanEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String libraryId;
    private String role;
    @OneToMany(mappedBy = "user")
    private List<LoanEntity> borrowedBooks;

    //private static final long serialVersionUID = 1L;
}
