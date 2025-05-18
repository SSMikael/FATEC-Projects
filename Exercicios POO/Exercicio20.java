/* Uso de super
Crie uma classe Veiculo com um atributo velocidade, 
Em seguida, crie uma classe Carro que herda de Veiculo e usa super para acessar o atributo da classe pai. */

class Veiculo {

    private int velocidade;

    public Veiculo(int velocidade) {

        this.velocidade = velocidade;
    }

    public int velocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {

        this.velocidade = velocidade;
    }
}

class Carro extends Veiculo {

    public Carro(int velocidade) {
        super(velocidade);
    }

    public void mostrarVelocidade() {
        System.out.println("A velocidade do carro é: " + super.velocidade());
    }
}

public class Exercicio20 {

    public static void main(String[] args) {

        Carro carro = new Carro(120);

        carro.mostrarVelocidade();
    }
}