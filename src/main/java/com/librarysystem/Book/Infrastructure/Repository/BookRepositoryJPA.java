package com.librarysystem.Book.Infrastructure.Repository;

import com.librarysystem.Book.Infrastructure.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoryJPA extends JpaRepository<BookEntity, Long> {
}
