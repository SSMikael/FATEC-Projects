// 3. Encapsulamento
// Crie uma classe ContaBancaria com atributos privados saldo e numeroConta. 
// Adicione métodos públicos para depositar, sacar e consultar o saldo.

import java.util.Scanner;

class ContaBancaria {

    private float saldo;
    private String numeroConta;

    public ContaBancaria(float saldo, String numeroConta) {

        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o valor do deposito inicial");
        float saldo = scanner.nextFloat();

        ContaBancaria conta = new ContaBancaria(saldo, numeroConta); {

            System.out.println("Numero da conta: " + conta.getNumeroConta());
            System.out.println("Saldo inicial: " + conta.getSaldo());

            System.out.println("Digite o valor a ser depositado: ");
            float valor = scanner.nextFloat();
            conta.depositar(valor);


            System.out.println("Novo saldo: " + conta.getSaldo());

            scanner.close();
        }
    }
}