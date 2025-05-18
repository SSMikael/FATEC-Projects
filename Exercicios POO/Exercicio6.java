// Static:
// Crie uma classe Contador com um atributo estático contador que é incrementado toda vez que um objeto é criado.

class Contador {


    public static int contador = 0;

    public Contador() {
        Contador.contador++;
    }

}

public class Exercicio6 {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Contador conta1 = new Contador();
        @SuppressWarnings("unused")
        Contador conta2 = new Contador();
        @SuppressWarnings("unused")
        Contador conta3 = new Contador();

        System.out.println("A quantidade de objetos criados é: " + Contador.contador);

    }
}