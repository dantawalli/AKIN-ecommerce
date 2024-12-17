package com.akin.ecommerce.controller;

import com.akin.ecommerce.record.AccountCredentials;
import com.akin.ecommerce.service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/api/auth")
public class LoginController {

    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public LoginController(JwtService jwtService, AuthenticationManager authenticationManager) {
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public ResponseEntity<?> getToken(@RequestBody AccountCredentials accountCredentials) {
        UsernamePasswordAuthenticationToken credentials = new UsernamePasswordAuthenticationToken(accountCredentials.username(), accountCredentials.password());

        Authentication auth = authenticationManager.authenticate(credentials);
        String jwts = jwtService.getToken(auth.getName());

        // Build response with the generated token
        return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION,
                "Bearer" + jwts).header(HttpHeaders.
                        ACCESS_CONTROL_EXPOSE_HEADERS,
                "Authorization").build();

    }
}
