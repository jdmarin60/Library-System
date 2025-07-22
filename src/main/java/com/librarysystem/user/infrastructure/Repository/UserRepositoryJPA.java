package com.librarysystem.user.infrastructure.Repository;

import aj.org.objectweb.asm.commons.Remapper;
import com.librarysystem.user.infrastructure.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoryJPA extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByName(String name);
    Optional<UserEntity> findByEmail(String email);
}
