package org.example.dto;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
public class CreateUserDto {
    @NotNull
    String username;

    @NotNull
    String email;

    @NotNull
    String password;
}
