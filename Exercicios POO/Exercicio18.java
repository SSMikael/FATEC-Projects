/* Classe Abstrata
Crie uma classe abstrata Forma com um método abstrato calcularArea(). 
Em seguida, crie classes Quadrado e Circulo que herdam de Forma. */

abstract class Forma {

    public abstract double calcularArea();
}

class Quadrado extends Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override

    public double calcularArea() {
        return lado * lado;
    }
}


class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}


public class Exercicio18 {

    public static void main(String[] args) {

        Forma quadrado = new Quadrado(5);
        Forma circulo = new Circulo (3);

        System.out.println("Area do quadrado: " + quadrado.calcularArea());
        System.out.println("Area do circulo: " + circulo.calcularArea());
    }

}