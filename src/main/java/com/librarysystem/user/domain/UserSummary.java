package com.librarysystem.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class UserSummary {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String libraryId;
    private String role;
    private boolean enabled;
}
