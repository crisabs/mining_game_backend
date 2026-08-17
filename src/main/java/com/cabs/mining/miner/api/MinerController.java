package com.cabs.mining.miner.api;

import com.cabs.mining.miner.api.dto.MinerDetailDto;
import com.cabs.mining.miner.api.dto.MinerMeResponse;
import com.cabs.mining.miner.domain.MinerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MinerController {

    private final MinerService minerService;

    @GetMapping({"/me"})
    public ResponseEntity<MinerMeResponse> getMe(){
        MinerDetailDto minerDetailDto = minerService.getMinerDetail();
        return ResponseEntity.ok(new MinerMeResponse(true,minerDetailDto));
    }
}
