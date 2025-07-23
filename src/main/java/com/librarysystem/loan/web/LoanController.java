package com.librarysystem.loan.web;

import com.librarysystem.loan.application.LoanDTO;
import com.librarysystem.loan.application.LoanService;
import com.librarysystem.user.application.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
@PreAuthorize("hasRole('ADMIN')")
@RequiredArgsConstructor
public class LoanController {
    private final LoanService loanService;

    @PostMapping
    public ResponseEntity<LoanDTO> create(@RequestBody LoanDTO loanDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(loanService.createAuthor(loanDTO));
    }

    @GetMapping("/overdue")
    public ResponseEntity<List<UserDTO>> getOverdueUsers() {
        List<UserDTO> users = loanService.getOverdueUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoanDTO> getById(@PathVariable Long id) {
        return loanService.getAuthorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<LoanDTO>> getAll() {
        return ResponseEntity.ok(loanService.getAllAuthors());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        loanService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }
}
