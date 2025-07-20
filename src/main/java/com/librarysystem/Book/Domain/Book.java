package com.librarysystem.Book.Domain;

import com.librarysystem.Author.Domain.Author;
import com.librarysystem.BookCopy.Domain.BookCopy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class Book {
    private Long id;
    private String title;
    private String isbn;
    private boolean availability;
    private List<BookCopy> copies;
    private Set<Author> authors;
}
