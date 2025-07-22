package com.librarysystem.user.application;

import com.librarysystem.security.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class CreateUserDTO {
    private String name;
    private String email;
    private String password;
    private String libraryId;
    private Role role;
    @Builder.Default
    private boolean enabled = true; // Default value set to true
}
