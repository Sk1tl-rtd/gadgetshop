package com.ua.gadgetshop.repository;

import com.ua.gadgetshop.domain.Gadget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryGadgetRepository implements GadgetRepository {

    private final Map<Long, Gadget> storage = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    @Override
    public List<Gadget> findAll() {
        List<Gadget> all = new ArrayList<>(storage.values());
        all.sort(Comparator.comparing(Gadget::getId));
        return all;
    }

    @Override
    public Optional<Gadget> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public Gadget save(Gadget gadget) {
        if (gadget.getId() == null) {
            gadget.setId(sequence.incrementAndGet());
        }
        storage.put(gadget.getId(), gadget);
        return gadget;
    }
}
