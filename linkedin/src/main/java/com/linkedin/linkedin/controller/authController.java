//Created by Aditi ❤ 2025 linkedinClone
package com.linkedin.linkedin.controller;


import com.linkedin.linkedin.dto.AuthenticationResponseBody;
import com.linkedin.linkedin.model.AuthenticateUser;
import com.linkedin.linkedin.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/authentication")
public class authController {
    private final AuthenticationService authService;

    public authController(AuthenticationService authService) {
        this.authService = authService;
    }

    @GetMapping("/users/email")
    public Optional<AuthenticateUser> getUser()
    {
        return authService.getUser("email@email.com");
    }

    @PostMapping("/register")
    public AuthenticationResponseBody responseBody(@Valid @RequestBody AuthenticationResponseBody registerRequestBody)
    {
        return authService.register(registerRequestBody);
    }

}
