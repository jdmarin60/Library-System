package com.librarysystem.security.application;

import com.librarysystem.security.domain.interfaces.AuthRepository;
import com.librarysystem.security.infrastructure.JWTServiceImpl;
import com.librarysystem.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl {
    private final AuthenticationManager authenticationManager;
    private final AuthRepository authRepository;
    private final JWTServiceImpl jwtServiceImpl;

    public String authenticate(AuthRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(), request.getPassword()
                )
        );

        User user = authRepository.findByName(request.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        return jwtServiceImpl.generateToken(user.getName());
    }
}
