package br.com.souza_anacarolina.buscacep;

import br.com.souza_anacarolina.buscacep.exceptions.CepNotFound;
import br.com.souza_anacarolina.buscacep.exceptions.InvalidCep;
import br.com.souza_anacarolina.buscacep.exceptions.InvalidOption;
import br.com.souza_anacarolina.buscacep.model.Adress;
import br.com.souza_anacarolina.buscacep.service.ApiConnection;
import br.com.souza_anacarolina.buscacep.service.Write;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Integer opcao = null;
        List<Adress> listaEnderecos = new ArrayList<>();
        String listaopcoes = "1 - Buscar endereço\n" + "2 - Visualizar endereços buscados\n" + "3 - Gerar arquivo json dos endereços buscados\n" + "4 - Gerar arquivo txt dos endereços buscados\n" + "5 - Sair";

        System.out.println("BEM VINDO AO BUSCADOR DE ENDEREÇOS VIA CEP\nEscolha uma opção para prosseguir.\n");
        System.out.println(listaopcoes);

        try {
            scanner.hasNextInt();
            opcao = scanner.nextInt();
            scanner.nextLine();
            while (opcao != 5) {

                if (opcao >= 1 && opcao <= 5) {
                    if (opcao == 1) {
                        System.out.println("Informe o cep do endereço");
                        String cep = scanner.nextLine().replaceAll("[^0-9]", "");
                        if (cep.length() == 8) {
                            ApiConnection apiConnection = new ApiConnection();
                            apiConnection.setCep(cep);
                            String jsonResultado = apiConnection.buscaEnderecoJson();
                            if (apiConnection.getStatus() == 200) {
                                Gson gson = new Gson();
                                Adress adress = gson.fromJson(jsonResultado, Adress.class);

                                if (adress.getErro() != null && adress.getErro()) {
                                    throw new CepNotFound("Erro: CEP não encontrado");
                                } else {
                                    listaEnderecos.add(adress);
                                    System.out.println("Endereço encontrado!\n");
                                    System.out.println("Oque deseja fazer agora?\n" + listaopcoes);
                                    opcao = scanner.nextInt();
                                    scanner.nextLine();
                                }
                            } else {
                                throw new CepNotFound("Erro: CEP não encontrado");
                            }
                        } else {
                            throw new InvalidCep("Erro: Um CEP válido deve conter exatamente 8 dígitos numéricos.");
                        }
                    } else if (opcao == 2) {
                        Write write = new Write();
                        write.consultaEndereco(listaEnderecos);
                        System.out.println("Oque deseja fazer agora?\n" + listaopcoes);
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                    } else if (opcao == 3) {
                        Write write = new Write();
                        write.arquivoJson(listaEnderecos);
                        System.out.println("Oque deseja fazer agora?\n" + listaopcoes);
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                    } else if (opcao == 4) {
                        Write write = new Write();
                        write.arquivoTxt(listaEnderecos);
                        System.out.println("Oque deseja fazer agora?\n" + listaopcoes);
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                    }

                } else {
                    System.out.println("Opção inválida. Informe uma opção de 1 a 5.\n\n" + listaopcoes);
                    opcao = scanner.nextInt();
                }
            }
        } catch (InputMismatchException | IOException e) {
            throw new InvalidOption("Erro: Deve ser informado uma opção válida para prosseguir ");
        }
    }
}
