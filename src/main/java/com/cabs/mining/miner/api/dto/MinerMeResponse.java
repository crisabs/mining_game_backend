package com.cabs.mining.miner.api.dto;

public record MinerMeResponse (
    boolean success,
    MinerDetailDto result
){}
