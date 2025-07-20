package com.librarysystem.Author.Infrastructure;

import com.librarysystem.Book.Infrastructure.BookEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "authors")
    @Builder.Default
    private Set<BookEntity> books = new HashSet<>();
    //private static final long serialVersionUID = 1L;
}
