package com.akin.ecommerce.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
@Getter
@Setter
public class AuthenticationRequest {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    // Getters and setters
}