package com.cabs.mining.accounts.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
@Schema(description = "Response for a user registration process")
public record RegisterResponse(
        @Schema(description = "Return true if the registration is successfully complete", example = "true")
        boolean success,
        @Schema(description = "Result message", example = "OK")
        String detail
) {
}
