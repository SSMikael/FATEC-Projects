abstract class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
}

public class Exercicio2 {
    public static void main(String[] args) {

        Carro  carro1 = new Carro("Volvo", "C250T", 2025) {
        };

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
    }
}