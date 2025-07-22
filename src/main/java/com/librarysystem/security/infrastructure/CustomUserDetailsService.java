package com.librarysystem.security.infrastructure;

import com.librarysystem.security.domain.interfaces.AuthRepository;
import com.librarysystem.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final AuthRepository authRepository;

    @Transactional
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = authRepository.findByName(name)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        System.out.println("Fetched password from DB: " + user.getPassword());
        return new CustomUserDetails(user);
    }
}
