package com.ua.gadgetshop.config;

import com.ua.gadgetshop.domain.Gadget;
import com.ua.gadgetshop.repository.GadgetRepository;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/** Початкове наповнення сховища після запуску контексту. */
@Component
public class GadgetSeeder implements ApplicationRunner {

    private final GadgetRepository repository;

    public GadgetSeeder(GadgetRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Gadget(null, "iPhone 15", "Apple", new BigDecimal("39999.00"), 2023,
                "Смартфон з чипом A16 Bionic.", List.of("6.1\" OLED", "128 ГБ", "USB-C")));
        repository.save(new Gadget(null, "Galaxy S24", "Samsung", new BigDecimal("34999.00"), 2024,
                "Флагманський смартфон із ШІ-функціями.", List.of("6.2\" AMOLED", "256 ГБ", "5G")));
        repository.save(new Gadget(null, "WH-1000XM5", "Sony", new BigDecimal("12999.00"), 2022,
                "Бездротові навушники з шумопоглинанням.", List.of("Bluetooth 5.2", "30 год роботи")));
        repository.save(new Gadget(null, "MacBook Air M2", "Apple", new BigDecimal("47999.00"), 2022,
                "Ультратонкий ноутбук на чипі M2.", List.of("13.6\" Retina", "8 ГБ RAM", "256 ГБ SSD")));
        repository.save(new Gadget(null, "Kindle Paperwhite", "Amazon", new BigDecimal("6999.00"), 2021,
                "Електронна книга з екраном E Ink.", List.of("6.8\" E Ink", "16 ГБ", "IPX8")));
    }
}
