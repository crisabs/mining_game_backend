package com.cabs.mining.miner.domain;

import com.cabs.mining.miner.api.dto.MinerDetailDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MinerService {

    @Transactional(readOnly = true)
    public MinerDetailDto getMinerDetail(){
        return new MinerDetailDto("PedroBrazosLargos",8,258, "Asturias");
    }

}
