package com.librarysystem.author.infrastructure.Repository;

import com.librarysystem.author.infrastructure.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepositoryJPA extends JpaRepository<AuthorEntity, Long> {
}
