package com.librarysystem.book.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BookSummary {
    private Long id;
    private String title;
    private String isbn;
    private boolean availability;
    private int copies;
}
