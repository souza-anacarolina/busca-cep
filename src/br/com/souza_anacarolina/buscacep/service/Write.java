package br.com.souza_anacarolina.buscacep.service;

import br.com.souza_anacarolina.buscacep.model.Adress;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write extends Adress {
    List<Adress> listaEnderecos = new ArrayList<>();

    public void arquivoJson() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.json");
        String jsonFormatado = gson.toJson(listaEnderecos);
        escrita.write(jsonFormatado);
        escrita.flush();
        escrita.close();
        System.out.println("Arquivo 'enderecos.json' gerado com sucesso!.\n");
    }

    public void arquivoTxt() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.txt");
        String jsonFormatado = gson.toJson(listaEnderecos);
        escrita.write(jsonFormatado);
        escrita.flush();
        escrita.close();
        System.out.println("Arquivo 'enderecos.json' gerado com sucesso!.\n");
    }

    public void consultaEndereco(){
        System.out.println("\n--- Endereços Consultados ---");
        for (Adress adress : listaEnderecos) {
            System.out.println("CEP: " + adress.getCep() + " | " + adress.getLogradouro() + ", " + adress.getBairro());
        }
        System.out.println("-----------------------------\n");
    }
}
