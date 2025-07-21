package com.librarysystem.book.infrastructure.Repository;

import com.librarysystem.book.infrastructure.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoryJPA extends JpaRepository<BookEntity, Long> {
}
