package br.com.souza_anacarolina.buscacep.service;

import br.com.souza_anacarolina.buscacep.exceptions.ConnectionError;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConnection {

    String cep;
    int status;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getStatus() {
        return status;
    }

    public String buscaEnderecoJson() {

        String URL = "https://viacep.com.br/ws/" + this.cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            status = response.statusCode();
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new ConnectionError("Não consegui conectar com o servidor do ViaCEP: " + e.getMessage());
        }
    }
}
