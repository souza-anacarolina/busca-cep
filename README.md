# 🔍 Busca CEP - Gerador de JSON/TXT

Um projeto pessoal em Java desenvolvido para buscar endereços a partir de um CEP informado pelo usuário, utilizando a API pública do ViaCEP e gerando um arquivo estruturado em formato JSON com o histórico das buscas.

Este projeto foi criado com o objetivo de praticar o consumo de APIs, manipulação de dados em formato JSON e escrita de arquivos localmente em Java.

---

## 🚀 Funcionalidades

* **Busca em Tempo Real:** O usuário digita o CEP e o sistema faz uma requisição HTTP para a API ViaCEP.
* **Validação de Dados:** Tratamento de erros para CEPs inválidos ou formatos incorretos.
* **Persistência local:** Armazena os endereços consultados em um arquivo `.json` organizado e fácil de ler.

## 🛠️ Tecnologias Utilizadas

* **Java 26** 
* **HttpClient:** Para realizar as requisições HTTP para a API.
* **Gson (Google):** Biblioteca para converter os dados da API em objetos Java e salvar o arquivo em formato JSON.
* **Maven:** Gerenciador de dependências do projeto.

---

## 📂 Estrutura de Pastas

O projeto segue as boas práticas de arquitetura, separando as responsabilidades em pacotes dedicados:

```text

br.com.buscacep/
├── model/       # Representação do Endereço (Classes de dados)
├── service/     # Integração com a API ViaCEP e escrita de arquivos
├── exceptions/  # Tratamento de exceções/erros 
└── Principal/Main.java # Inicialização e interação via terminal

```

## ⚙️ Como Executar o Projeto

## Pré-requisitos

Você vai precisar de:

Java JDK 26 (ou superior) instalado.

Uma IDE (recomendado IntelliJ IDEA).

## Passo a Passo

1 - Clone este repositório no seu computador:

git clone [https://github.com/seu-usuario/busca-cep.git](https://github.com/seu-usuario/busca-cep.git)

2 - Abra o projeto na sua IDE de preferência.

3 - Deixe o Maven baixar a dependência do Gson.

4 - Execute a classe principal Main.java.

5 - Digite um CEP válido com 8 dígitos no terminal e veja a mágica acontecer!

## 👩‍💻 Aprendizados e Evolução
Desenvolver este projeto me permitiu entender na prática:

1 - Como funciona o protocolo HTTP (Requisições e Respostas).

2 - Como ler e interpretar dados estruturados no formato JSON.

3 - A importância de tratar exceções (erros) quando dependemos de serviços externos.

Desenvolvido com ☕ e Java por Ana Carolina / https://github.com/souza-anacarolina.
