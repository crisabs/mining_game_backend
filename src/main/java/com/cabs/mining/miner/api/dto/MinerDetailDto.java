package com.cabs.mining.miner.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Miner details")
public record MinerDetailDto(
        @Schema(description = "Player Nickname",example = "Big Joe")
        String nickname,
        @Schema(description = "Actual Player Level", example = "123")
        int level,
        @Schema(description = "Player coins", example = "1050")
        int coins,
        @Schema(description = "Current Player Mine Zone", example = "Asturias")
        String currentZone
) {
}
