package com.librarysystem.Book.Domain;

import com.librarysystem.Author.Domain.AuthorSummary;
import com.librarysystem.BookCopy.Domain.BookCopy;
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
public class Book {
    private Long id;
    private String title;
    private String isbn;
    private boolean availability;
    @Builder.Default
    private List<BookCopy> copies = new ArrayList<>();
    @Builder.Default
    private List<AuthorSummary> authors = new ArrayList<>();
}
