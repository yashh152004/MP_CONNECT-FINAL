package com.mpconnect.service;

import com.mpconnect.dto.AuthRequest;
import com.mpconnect.dto.AuthResponse;
import com.mpconnect.dto.RegisterRequest;
import com.mpconnect.entity.User;
import com.mpconnect.entity.UserRole;
import com.mpconnect.repository.UserRepository;
import com.mpconnect.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthService {

        private final UserRepository repository;
        private final PasswordEncoder passwordEncoder;
        private final JwtService jwtService;
        private final AuthenticationManager authenticationManager;

        public AuthResponse register(RegisterRequest request) {
                var user = User.builder()
                                .id(UUID.randomUUID().toString())
                                .name(request.getName())
                                .email(request.getEmail())
                                .password(passwordEncoder.encode(request.getPassword()))
                                .role(UserRole.valueOf(request.getRole().toUpperCase()))
                                .constituency(request.getConstituency())
                                .build();

                repository.save(user);

                var jwtToken = jwtService.generateToken(user);

                return AuthResponse.builder()
                                .token(jwtToken)
                                .userId(user.getId())
                                .name(user.getName())
                                .role(user.getRole().name())
                                .build();
        }

        public AuthResponse login(AuthRequest request) {
                authenticationManager.authenticate(
                                new UsernamePasswordAuthenticationToken(
                                                request.getEmail(),
                                                request.getPassword()));
                var user = repository.findByEmail(request.getEmail())
                                .orElseThrow();
                var jwtToken = jwtService.generateToken(user);

                return AuthResponse.builder()
                                .token(jwtToken)
                                .userId(user.getId())
                                .name(user.getName())
                                .role(user.getRole().name())
                                .build();
        }
}
