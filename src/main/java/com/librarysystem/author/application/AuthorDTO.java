package com.librarysystem.author.application;

import com.librarysystem.book.domain.BookSummary;
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
public class AuthorDTO {
    private Long id;
    private String name;
    @Builder.Default
    private List<BookSummary> books = new ArrayList<>();
}
