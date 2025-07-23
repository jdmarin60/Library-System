package com.librarysystem.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jwt")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class JWTTokenProperties {
    private String secret;
    private long expiration;
}
