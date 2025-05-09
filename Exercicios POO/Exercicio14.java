/*Construtor de Cópia
Crie uma classe Ponto com atributos x e y. 
Adicione um construtor de cópia para criar um novo objeto Ponto a partir de outro. */

class Ponto {

    private int x;
    private int y;

    public Ponto(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public Ponto(Ponto outroPonto) {

        this.x = outroPonto.x;
        this.y = outroPonto.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Exercicio14 {

    public static void main(String[] args) {

        Ponto ponto1 = new Ponto(3, 4);
        Ponto ponto2 = new Ponto(ponto1);

        System.out.println("Ponto 1: " + ponto1.getX() + ", " + ponto1.getY());
        System.out.println("Ponto 2: " + ponto2.getX() + ", " + ponto2.getY());
    }
}