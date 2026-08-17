package com.cabs.mining.mineral.domain;

import com.cabs.mining.mineral.api.dto.MineralDetailDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MineralService {

    @Transactional(readOnly = true)
    public MineralDetailDto getMineralDetails(int mineralId){
        return new MineralDetailDto("Esmeralda",100,"Asturias","Piedra semipreciosa de color verde");
    }
}
