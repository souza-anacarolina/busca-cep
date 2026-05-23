package br.com.souza_anacarolina.buscacep.exceptions;

import java.util.InputMismatchException;

public class InvalidOption extends InputMismatchException {
    private String message;

    public InvalidOption(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
