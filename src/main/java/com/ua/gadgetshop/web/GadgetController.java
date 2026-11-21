package com.ua.gadgetshop.web;

import com.ua.gadgetshop.service.GadgetService;
import com.ua.gadgetshop.web.dto.GadgetCardDto;
import com.ua.gadgetshop.web.dto.GadgetDetailDto;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gadgets")
public class GadgetController {

    private final GadgetService gadgetService;

    public GadgetController(GadgetService gadgetService) {
        this.gadgetService = gadgetService;
    }

    @GetMapping
    public List<GadgetCardDto> list() {
        return gadgetService.findAll();
    }

    @GetMapping("/{id}")
    public GadgetDetailDto getOne(@PathVariable Long id) {
        return gadgetService.findById(id);
    }
}
