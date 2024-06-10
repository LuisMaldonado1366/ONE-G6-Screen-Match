package com.aluracursos.screenmatch.exceptions;

public class ErrorInDurationException extends RuntimeException {

    private final String message;

    public ErrorInDurationException(String invalidDurationFormat) {
        this.message = invalidDurationFormat;

    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
