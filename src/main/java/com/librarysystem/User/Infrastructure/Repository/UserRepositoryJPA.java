package com.librarysystem.User.Infrastructure.Repository;

import com.librarysystem.User.Infrastructure.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository<UserEntity, Long> {
}
