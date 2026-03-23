package com.alura.screenmatch.exception;

public class YearErrorConversionException extends RuntimeException {
    private String message;

    public YearErrorConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
