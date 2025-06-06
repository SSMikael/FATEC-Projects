package com.CRM.CRM_FATEC;

import jakarta.persistence.Entity;

@Entity
@table(name = "tb_clientes")

// git commit --amend (atualiza o ultimo commit com detalhes simples)
// git push --force

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private string nome;
    private string cpf;
    private Endereco endereco;
    private int id;

    public Cliente(string nome, string cpf) {

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente() {

        this.nome = "";
        this.cpf = "";
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
}