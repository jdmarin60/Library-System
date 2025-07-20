package com.librarysystem.Book.Application;

import com.librarysystem.Author.Application.AuthorDTO;
import com.librarysystem.BookCopy.Application.BookCopyDTO;
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
public class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private boolean availability;
    private List<BookCopyDTO> copies;
    private Set<AuthorDTO> authors;
}
