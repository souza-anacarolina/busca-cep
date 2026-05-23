package br.com.souza_anacarolina.buscacep.exceptions;

public class CepNotFound extends RuntimeException {
    private String message;
    public CepNotFound(String message) {
       this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
