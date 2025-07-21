package com.librarysystem.bookcopy.infrastructure.Repository;

import com.librarysystem.bookcopy.infrastructure.BookCopyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCopyRepositoryJPA extends JpaRepository<BookCopyEntity, Long> {
}
