package com.librarysystem.Author.Application;

import com.librarysystem.Book.Application.BookDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class AuthorDTO {
    private Long id;
    private String name;
    private Set<BookDTO> books;
}
