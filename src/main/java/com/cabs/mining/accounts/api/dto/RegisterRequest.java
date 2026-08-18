package com.cabs.mining.accounts.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @Schema(description = "User email", example = "peter@email.com")
        @NotBlank(message = "Email should not be empty")
        @Email(message = "Provide a valid email")
        String email,

        @Schema(description = "Password user's account", example = "Pedrito123@")
        @NotBlank(message = "Password should not be empty")
        @Size(min = 6, message = "Password should contain at least 6 symbols")
        String password
) {
}
