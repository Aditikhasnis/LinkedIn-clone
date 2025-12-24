//Created by Aditi ❤ 2025 linkedinClone
package com.linkedin.linkedin.controller;


import com.linkedin.linkedin.dto.AuthenticationResponseBody;
import com.linkedin.linkedin.dto.LoginRequest;
import com.linkedin.linkedin.dto.RegisterRequest;
import com.linkedin.linkedin.model.AuthenticateUser;
import com.linkedin.linkedin.service.AuthenticationService;
import com.linkedin.linkedin.utils.Encoder;
import com.linkedin.linkedin.utils.JSONWebToken;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authentication")
public class authController {
    private final Encoder encoder;
    private final AuthenticationService authService;
    private final JSONWebToken jsonWebToken;
    public authController(AuthenticationService authService , Encoder encoder, JSONWebToken jsonWebToken) {
        this.authService = authService;
        this.encoder=encoder;
        this.jsonWebToken = jsonWebToken;
    }

    @PostMapping("/register")
    public AuthenticationResponseBody register(@Valid @RequestBody RegisterRequest registerRequestBody)
    {
        return authService.register(registerRequestBody);
    }

    @PostMapping("/login")
    public AuthenticationResponseBody login(@Valid @RequestBody LoginRequest loginRequest)
    {
        AuthenticateUser user = authService.getUser(loginRequest.getEmail()).orElseThrow(()-> new IllegalArgumentException("User not found"));
        if(!encoder.matches(loginRequest.getPassword(),user.getPassword()))
        {
            throw new IllegalArgumentException("Password is invalid");
        }

        String token = jsonWebToken.generateToken(loginRequest.getEmail());

        return new AuthenticationResponseBody(token,"Authentication succeeded");
    }
}
