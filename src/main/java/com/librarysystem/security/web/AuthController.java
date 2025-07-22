package com.librarysystem.security.web;

import com.librarysystem.security.application.AuthRequest;
import com.librarysystem.security.application.AuthResponse;
import com.librarysystem.security.application.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthServiceImpl authServiceImpl;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        String token = authServiceImpl.authenticate(request);
        return ResponseEntity.ok(new AuthResponse(token));
    }
}
