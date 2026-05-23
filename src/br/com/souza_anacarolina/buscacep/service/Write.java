package br.com.souza_anacarolina.buscacep.service;

import br.com.souza_anacarolina.buscacep.model.Adress;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write extends Adress {


    public void arquivoJson(List<Adress> listaEnderecos) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.json");
        String jsonFormatado = gson.toJson(listaEnderecos);
        escrita.write(jsonFormatado);
        escrita.close();
        System.out.println("Arquivo 'enderecos.json' gerado com sucesso!.\n");
    }

    public void arquivoTxt(List<Adress> listaEnderecos) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.txt");
        String jsonFormatado = gson.toJson(listaEnderecos);
        escrita.write(jsonFormatado);
        escrita.close();
        System.out.println("Arquivo 'enderecos.json' gerado com sucesso!.\n");
    }


    public void consultaEndereco(List<Adress> listaEnderecos) {
        if (listaEnderecos.isEmpty()) {
            System.out.println("\nAVISO: Nenhum endereço para exibir.");
        } else {
            System.out.println("\n--- Endereços Consultados ---");
            for (Adress adress : listaEnderecos) {
                System.out.println("CEP: " + adress.getCep() + " | LOGRADOURO: " + adress.getLogradouro() + ", BAIRRO: " + adress.getBairro() + " | CIDADE: " + adress.getLocalidade() +
                        " | ESTADO: " + adress.getEstado() + " - " + adress.getUf() + " | REGIÃO: " + adress.getRegiao());
            }
            System.out.println("-----------------------------\n");
        }
    }
}
