package br.com.souza_anacarolina.buscacep.exceptions;

public class InvalidCep extends RuntimeException {

    private String message;

    public InvalidCep(String message) {
         this.message = message;
    }

    @Override
    public String getMessage() {
       return this.message;
    }
}
