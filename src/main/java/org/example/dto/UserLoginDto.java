package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class UserLoginDto {

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;
}
