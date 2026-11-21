package com.ua.gadgetshop.service.mapper;

import com.ua.gadgetshop.domain.Gadget;
import com.ua.gadgetshop.web.dto.GadgetCardDto;
import com.ua.gadgetshop.web.dto.GadgetDetailDto;
import org.springframework.stereotype.Component;

@Component
public class GadgetMapper {

    public GadgetCardDto toCard(Gadget b) {
        return new GadgetCardDto(b.getId(), b.getName(), b.getBrand(), b.getPrice());
    }

    public GadgetDetailDto toDetail(Gadget b) {
        return new GadgetDetailDto(b.getId(), b.getName(), b.getBrand(), b.getPrice(),
                b.getReleaseYear(), b.getDescription(), b.getSpecs());
    }
}
