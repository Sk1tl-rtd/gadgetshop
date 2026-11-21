package com.ua.gadgetshop.service;

import com.ua.gadgetshop.web.dto.GadgetCardDto;
import com.ua.gadgetshop.web.dto.GadgetDetailDto;
import java.util.List;

public interface GadgetService {
    List<GadgetCardDto> findAll();
    GadgetDetailDto findById(Long id);
}
