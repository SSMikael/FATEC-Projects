//. Métodos
//Crie uma classe Calculadora com métodos para somar, subtrair, multiplicar e dividir dois números.

import java.util.Scanner;

class Calculadora {

    public float numero1;
    public float numero2;

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float somar(float numero1, float numero2) {
        numero1 = numero1 + numero2;
        return numero1;
    }

    public float subtrair(float numero1, float numero2) {
        numero1 = numero1 - numero2;
        return numero1;
    }

    public float multiplicar(float numero1, float numero2) {
        numero1 = numero1 * numero2;
        return numero1;
    }

public float dividir(float numero1, float numero2) {
    if (numero2 != 0) {
        numero1 = numero1 / numero2;
        return numero1;
    } else {
        System.out.println("Divisao por zero não existe.");
        return 0;
    }
    }
}

public class Exercicio4 {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        float numero2 = scanner.nextInt();

        System.out.println("Escolha a operação: 1 - Somar, 2 - Subtrair, 3 - Multiplicar, 4 - Dividir");
        int operacao = scanner.nextInt();
        
        scanner.close();

        Calculadora calculadora = new Calculadora(numero1, numero2); {

            if (operacao == 1) {
                System.out.println("Resultado da soma: " + calculadora.somar(numero1, numero2));
            } else if (operacao == 2) {
                System.out.println("Resultado da subtracao: " + calculadora.subtrair(numero1, numero2));
            } else if (operacao == 3) {
                System.out.println("Resultado da multiplicacao: " + calculadora.multiplicar(numero1, numero2));
            } else if (operacao == 4) {
                System.out.println("Resultado da divisao: " + calculadora.dividir(numero1, numero2));
            } else {
                System.out.println("Operacao invalida.");
            }
        }
    }
}
