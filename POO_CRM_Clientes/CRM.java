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

private class Cliente {

    private string email;
    private string senha;
    private string nome;
    private string cpf;
    private Endereco endereco;

    public Cliente(string email, string senha, string nome, string cpf, Endereco endereco) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente() {
        this.email = "";
        this.senha = "";
        this.nome = "";
        this.cpf = "";
        this.endereco = new Endereco();
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