package com.abidev.newsapi.controllers;

import com.abidev.newsapi.dto.AuthRequestDTO;
import com.abidev.newsapi.dto.LoginResponseDTO;
import com.abidev.newsapi.entity.User;
import com.abidev.newsapi.services.AuthenticationService;
import com.abidev.newsapi.services.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.logging.Logger;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final Logger LOG = Logger.getLogger(AuthController.class.getName());

    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody AuthRequestDTO authRequestDTO) {
        LOG.info("Login request received");
        User authenticatedUser = authenticationService.authenticate(authRequestDTO);
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                authenticatedUser.getUsername(),
                authenticatedUser.getPassword(),
                Collections.emptyList()
        );
        String token = jwtService.generateToken(userDetails);

        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        loginResponseDTO.setToken(token);
        loginResponseDTO.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponseDTO);
    }

}
