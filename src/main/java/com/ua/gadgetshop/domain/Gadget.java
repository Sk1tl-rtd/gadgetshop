package com.ua.gadgetshop.domain;

import java.math.BigDecimal;
import java.util.List;

/** Доменна модель гаджета. Без залежностей на фреймворк. */
public class Gadget {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int releaseYear;
    private String description;
    private List<String> specs;

    public Gadget(Long id, String name, String brand, BigDecimal price, int releaseYear,
                String description, List<String> specs) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.releaseYear = releaseYear;
        this.description = description;
        this.specs = specs;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public BigDecimal getPrice() { return price; }
    public int getReleaseYear() { return releaseYear; }
    public String getDescription() { return description; }
    public List<String> getSpecs() { return specs; }
}
