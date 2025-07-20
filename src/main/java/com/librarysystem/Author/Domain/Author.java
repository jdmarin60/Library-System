package com.librarysystem.Author.Domain;

import com.librarysystem.Book.Domain.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class Author {
    private Long id;
    private String name;
    private Set<Book> books;
}
