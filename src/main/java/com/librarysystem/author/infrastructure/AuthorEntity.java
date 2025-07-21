package com.librarysystem.author.infrastructure;

import com.librarysystem.book.infrastructure.BookEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
    private List<BookEntity> books = new ArrayList<>();
    //private static final long serialVersionUID = 1L;
}
