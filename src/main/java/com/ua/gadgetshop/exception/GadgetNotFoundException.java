package com.ua.gadgetshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GadgetNotFoundException extends RuntimeException {
    public GadgetNotFoundException(Long id) {
        super("Гаджет з id=" + id + " не знайдено");
    }
}
