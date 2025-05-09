/* Interface Simples
Crie uma interface Desenhavel com um método desenhar().
Em seguida, crie uma classe Circulo que implementa essa interface. */


interface Desenhavel {
    void desenhar();
}

class Circulo implements Desenhavel {

    @Override

    public void desenhar() {
        System.out.println("Desenhando circulo com um metodo definido na interface... ");
    }
}

public class Exercicio17 {

    public static void main(String[] args) {

    Circulo circulo = new Circulo();

    circulo.desenhar();
    }
}