package com.librarysystem.BookCopy.Infrastructure.Repository;

import com.librarysystem.BookCopy.Infrastructure.BookCopyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCopyRepositoryJPA extends JpaRepository<BookCopyEntity, Long> {
}
