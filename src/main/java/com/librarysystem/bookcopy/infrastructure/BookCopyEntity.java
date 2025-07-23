package com.librarysystem.bookcopy.infrastructure;

import com.librarysystem.book.infrastructure.BookEntity;
import com.librarysystem.loan.infrastructure.LoanEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
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
    @Builder.Default
    private BookEntity book = new BookEntity();

    @OneToMany(mappedBy = "bookCopy")
    @Builder.Default
    private List<LoanEntity> loans = new ArrayList<>();

    //private static final long serialVersionUID = 1L;
}
