package com.librarysystem.loan.Web;

import com.librarysystem.loan.Application.LoanDTO;
import com.librarysystem.loan.Application.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
@RequiredArgsConstructor
public class LoanController {
    private final LoanService loanService;

    @PostMapping
    public ResponseEntity<LoanDTO> create(@RequestBody LoanDTO loanDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(loanService.createAuthor(loanDTO));
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
