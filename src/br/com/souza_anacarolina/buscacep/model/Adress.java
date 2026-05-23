package br.com.souza_anacarolina.buscacep.model;



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






}
