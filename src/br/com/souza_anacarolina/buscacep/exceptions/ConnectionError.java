package br.com.souza_anacarolina.buscacep.exceptions;

public class ConnectionError extends RuntimeException {
    private String message;

    public ConnectionError(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
