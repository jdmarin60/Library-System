package com.librarysystem.bookcopy.application;

import com.librarysystem.book.domain.BookSummary;
import com.librarysystem.loan.domain.LoanSummary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BookCopyDTO {
    private Long id;
    private String barcode; // Unique ID for the physical copy
    @Builder.Default
    private BookSummary book = new BookSummary();
    @Builder.Default
    private List<LoanSummary> loans = new ArrayList<>();
}
