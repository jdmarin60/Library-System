package com.librarysystem.bookcopy.application;

import com.librarysystem.book.application.BookDTO;

import com.librarysystem.loan.application.LoanDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BookCopyDTO {
    private Long id;
    private String barcode; // Unique ID for the physical copy
    private BookDTO book;
    private List<LoanDTO> loans;
}
