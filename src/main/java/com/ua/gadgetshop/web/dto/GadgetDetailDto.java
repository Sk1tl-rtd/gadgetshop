package com.ua.gadgetshop.web.dto;

import java.math.BigDecimal;
import java.util.List;

/** Повний вигляд однієї гаджета. */
public record GadgetDetailDto(Long id, String name, String brand, BigDecimal price,
                            int releaseYear, String description, List<String> specs) {}
