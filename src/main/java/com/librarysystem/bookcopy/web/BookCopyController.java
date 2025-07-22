package com.librarysystem.bookcopy.web;

import com.librarysystem.bookcopy.application.BookCopyDTO;
import com.librarysystem.bookcopy.application.BookCopyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookcopies")
@PreAuthorize("hasRole('ADMIN')")
@RequiredArgsConstructor
public class BookCopyController {
    private final BookCopyService bookCopyService;

    @PostMapping
    public ResponseEntity<BookCopyDTO> create(@RequestBody BookCopyDTO bookCopyDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookCopyService.createBookCopy(bookCopyDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookCopyDTO> getById(@PathVariable Long id) {
        return bookCopyService.getBookCopyById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<BookCopyDTO>> getAll() {
        return ResponseEntity.ok(bookCopyService.getAllBooks());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bookCopyService.deleteBookCopy(id);
        return ResponseEntity.noContent().build();
    }
}
