package com.librarysystem.author.web;

import com.librarysystem.author.application.AuthorDTO;
import com.librarysystem.author.application.AuthorService;
import com.librarysystem.author.application.CreateAuthorDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
@Tag(name = "Author", description = "Operations related to authors")
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping
    public ResponseEntity<AuthorDTO> create(@RequestBody CreateAuthorDTO createAuthorDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authorService.createAuthor(createAuthorDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> getById(@PathVariable Long id) {
        return authorService.getAuthorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<AuthorDTO>> getAll() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }
}
