package br.com.souza_anacarolina.buscacep.model;


public class Adress {

    String cep;
    String logradouro;
    String bairro;
    String localidade;
    String uf;
    String estado;
    String regiao;
    Boolean erro;

    public Boolean getErro() {
        return erro;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }
}
