package com.cabs.mining.mineral.api;

import com.cabs.mining.mineral.domain.MineralService;
import com.cabs.mining.mineral.api.dto.MineralDetailDto;
import com.cabs.mining.mineral.api.dto.MineralDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/minerals"})
@RequiredArgsConstructor
public class MineralController {

    private final MineralService mineralService;

    @GetMapping("/{id}")
    public ResponseEntity<MineralDetailResponse> getMineralDetail(
            @PathVariable("id") int mineralId
    ){
        MineralDetailDto details = mineralService.getMineralDetails(mineralId);
        return ResponseEntity.ok(new MineralDetailResponse(true, details));
    }

    @GetMapping
    public ResponseEntity<List<MineralDetailDto>> listMinerals(
            @RequestParam(name="zone", required = false) String zone){
        return null;
    }
}
