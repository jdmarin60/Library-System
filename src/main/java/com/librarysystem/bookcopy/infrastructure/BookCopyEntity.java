package com.librarysystem.bookcopy.infrastructure;

import com.librarysystem.book.infrastructure.BookEntity;
import com.librarysystem.loan.Infrastructure.LoanEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "book_copies")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BookCopyEntity {
    //id, title, isbn, availability, author
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String barcode; // Unique ID for the physical copy

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity book;

    @OneToMany(mappedBy = "bookCopy")
    private List<LoanEntity> loans;

    //private static final long serialVersionUID = 1L;
}
