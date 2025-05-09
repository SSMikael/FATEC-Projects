/*Método Estático
Crie uma classe Utilidades com um método estático 
gerarNumeroAleatorio(int min, int max) que retorna um número aleatório 
dentro do intervalo. */

class Utilidades {

    public static int gerarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

public class Exercicio15 {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        System.out.println("Numero aleatorio entre " + min + " e " + max + ": " + Utilidades.gerarNumeroAleatorio(min, max));
    }
}