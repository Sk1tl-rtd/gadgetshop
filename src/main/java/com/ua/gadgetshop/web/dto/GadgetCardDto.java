package com.ua.gadgetshop.web.dto;

import java.math.BigDecimal;

/** Короткий вигляд гаджета для переліку. */
public record GadgetCardDto(Long id, String name, String brand, BigDecimal price) {}
