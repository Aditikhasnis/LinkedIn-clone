package com.linkedin.linkedin.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponseBody {
    
    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private String email;
    
    @NotBlank(message = "Password is required")
    private String password;
    
    private Long id;
    private String token;
    
    // Constructor for registration requests (without id and token)
    public AuthenticationResponseBody(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    // Constructor for responses (with id, without password)
    public AuthenticationResponseBody(String email, Long id, String token) {
        this.email = email;
        this.id = id;
        this.token = token;
    }
}
