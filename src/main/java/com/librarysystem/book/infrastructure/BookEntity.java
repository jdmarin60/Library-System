package com.librarysystem.book.infrastructure;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.librarysystem.author.infrastructure.AuthorEntity;
import com.librarysystem.bookcopy.infrastructure.BookCopyEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BookEntity {
    //id, title, isbn, availability, author
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private boolean availability;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<BookCopyEntity> copies = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "book_authors",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    @Builder.Default
    @JsonIgnore
    private List<AuthorEntity> authors = new ArrayList<>();
    //private static final long serialVersionUID = 1L;
}
