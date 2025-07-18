package com.librarysystem.Author.Infrastructure.Repository;

import com.librarysystem.Author.Infrastructure.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepositoryJPA extends JpaRepository<AuthorEntity, Long> {
}
