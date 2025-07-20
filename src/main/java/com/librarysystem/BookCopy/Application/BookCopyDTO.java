package com.librarysystem.BookCopy.Application;

import com.librarysystem.Book.Application.BookDTO;

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
public class BookCopyDTO {
    private Long id;
    private String barcode; // Unique ID for the physical copy
    private BookDTO book;
    private List<LoanDTO> loans;
}
