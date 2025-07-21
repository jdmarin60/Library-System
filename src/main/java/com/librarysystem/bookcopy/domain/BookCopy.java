package com.librarysystem.bookcopy.domain;

import com.librarysystem.book.domain.Book;
import com.librarysystem.loan.domain.Loan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BookCopy {
    private Long id;
    private String barcode; // Unique ID for the physical copy
    private Book book;
    private List<Loan> loans;
}
