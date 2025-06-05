/* Requisitos:
 * 
 * 1. Criar cadastro de clientes;
 * -nome
 * -cpf
 * -endereço
 * -data de nascimento
 * -login (senha e email)
 * 
 * 2. criar cadastro de entregadores;
 * -nome do entregador;
 * -placa do veiculo;
 * 
 * 3. Criar cadastro de avaliações;
 * -avaliação do estabelecimento;
 * -avaliação do cliente;
 * -avaliação do entregador;
 * 
 * 4. criar um programa fidelidade;
 * - histórico de pedidos;
 * 
 * 5. criar catalogo de produtos;
 * 
 * 6. criar campanhas (mala direta enviada no numero de celular e email do cliente);
 * 
 * 7. criar carrinho de compras;
 */

import java.util.Scanner;

public enum EstadoBrasil {
    AC("Acre", "AC"),
    AL("Alagoas", "AL"),
    AP("Amapá", "AP"),
    AM("Amazonas", "AM"),
    BA("Bahia", "BA"),
    CE("Ceará", "CE"),
    DF("Distrito Federal", "DF"),
    ES("Espírito Santo", "ES"),
    GO("Goiás", "GO"),
    MA("Maranhão", "MA"),
    MT("Mato Grosso", "MT"),
    MS("Mato Grosso do Sul", "MS"),
    MG("Minas Gerais", "MG"),
    PA("Pará", "PA"),
    PB("Paraíba", "PB"),
    PR("Paraná", "PR"),
    PE("Pernambuco", "PE"),
    PI("Piauí", "PI"),
    RJ("Rio de Janeiro", "RJ"),
    RN("Rio Grande do Norte", "RN"),
    RS("Rio Grande do Sul", "RS"),
    RO("Rondônia", "RO"),
    RR("Roraima", "RR"),
    SC("Santa Catarina", "SC"),
    SP("São Paulo", "SP"),
    SE("Sergipe", "SE"),
    TO("Tocantins", "TO");
}

public class Endereco {

    private string rua;
    private string bairro;
    private string cidade;
    private string estado;
    private string cep;
    private int numero;
}

private class Usuario {

    private string email;
    private string senha;

    public Usuario(string email, string senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
        this.email = "";
        this.senha = "";
    }

    public string getEmail() {
        return email;
    }

    public void setEmail(string email) {
        this.email = email;
    }

    public string getSenha() {
        return senha;
    }

    public void setSenha(string senha) {
        this.senha = senha;
    }

    public criarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu email:");

        while (this.email == null || this.email.isEmpty()) {
            System.out.println("Email inválido. Por favor digite novamente:");
            this.email = scanner.nextLine();
        }

        System.out.println("Digite sua senha:");

        while (this.senha == null || this.senha.isEmpty()) {
            System.out.println("Senha inválida. Por favor digite novamente:");
            this.senha = scanner.nextLine();
        }

        System.out.println("Usuário criado com sucesso!");
        scanner.close();
    }
}

private class Cliente {

    private string nome;
    private string cpf;
    private Endereco endereco;

    public Cliente(string nome, string cpf, Endereco endereco) {

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente() {

        this.nome = "";
        this.cpf = "";
        this.endereco = new Endereco();
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getCpf() {
        return cpf;
    }

    public void setCpf(string cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

public class CRM {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao CRM FATEC!");
        System.out.println("Selecione uma das opções para prosseguir:");

        int opcao;
        opcao = 0;

        System.out.println("/n");
        System.out.println("(1) - Criar novo cadastro. ");
        System.out.println("(2) - Realizar login. ");
        opcao = scanner.nextLine();

        if (opcao == 1) {

            System.out.println("Criando cadastro: ");

            Cliente cliente = new Cliente();

            cliente.criarUsuario();


        }
    }
}