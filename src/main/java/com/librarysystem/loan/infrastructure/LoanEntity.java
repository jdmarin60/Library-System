package com.librarysystem.loan.infrastructure;

import com.librarysystem.bookcopy.infrastructure.BookCopyEntity;
import com.librarysystem.user.infrastructure.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "loans")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date   loanDate;
    private Date   dueDate;
    private Date   returnedDate;
    @ManyToOne(optional = false)
    private UserEntity user;
    @ManyToOne(optional = false)
    private BookCopyEntity bookCopy;

    //private static final long serialVersionUID = 1L;
}
