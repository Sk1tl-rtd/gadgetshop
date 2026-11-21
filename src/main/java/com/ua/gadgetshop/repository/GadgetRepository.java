package com.ua.gadgetshop.repository;

import com.ua.gadgetshop.domain.Gadget;
import java.util.List;
import java.util.Optional;

public interface GadgetRepository {
    List<Gadget> findAll();
    Optional<Gadget> findById(Long id);
    Gadget save(Gadget gadget);
}
