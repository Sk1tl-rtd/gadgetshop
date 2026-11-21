package com.ua.gadgetshop.service;

import com.ua.gadgetshop.exception.GadgetNotFoundException;
import com.ua.gadgetshop.repository.GadgetRepository;
import com.ua.gadgetshop.service.mapper.GadgetMapper;
import com.ua.gadgetshop.web.dto.GadgetCardDto;
import com.ua.gadgetshop.web.dto.GadgetDetailDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GadgetServiceImpl implements GadgetService {

    private final GadgetRepository repository;
    private final GadgetMapper mapper;

    public GadgetServiceImpl(GadgetRepository repository, GadgetMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<GadgetCardDto> findAll() {
        return repository.findAll().stream().map(mapper::toCard).toList();
    }

    @Override
    public GadgetDetailDto findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDetail)
                .orElseThrow(() -> new GadgetNotFoundException(id));
    }
}
