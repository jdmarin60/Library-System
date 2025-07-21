package com.librarysystem.user.infrastructure.Repository;

import com.librarysystem.user.infrastructure.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository<UserEntity, Long> {
}
