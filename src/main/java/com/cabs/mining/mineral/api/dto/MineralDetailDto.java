package com.cabs.mining.mineral.api.dto;

public record MineralDetailDto(
        String name,
        int price,
        String zone,
        String description
) {
}
