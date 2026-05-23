package br.com.souza_anacarolina.buscacep.model;

import java.util.ArrayList;
import java.util.List;

public class Adress {

    String cep;
    String logradouro;
    String bairro;
    Boolean erro;

    public Boolean getErro() {
        return erro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setListaEnderecos(List<Adress> listaEnderecos) {
        this.listaEnderecos = listaEnderecos;
    }

    public void getListaEnderecos(){
        System.out.println("\n--- Endereços Consultados ---");
        for (Adress adress : listaEnderecos) {
            System.out.println("CEP: " + adress.getCep() + " | " + adress.getLogradouro() + ", " + adress.getBairro());
        }
        System.out.println("-----------------------------\n");
    }

    List<Adress> listaEnderecos = new ArrayList<>();


}
