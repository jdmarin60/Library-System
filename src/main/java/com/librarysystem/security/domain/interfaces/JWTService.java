package com.librarysystem.security.domain.interfaces;

public interface JWTService {
    String generateToken(String username);
    String extractUsername(String token);
    boolean isTokenValid(String token, String username);
}
