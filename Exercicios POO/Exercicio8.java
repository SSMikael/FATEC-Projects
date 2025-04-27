class Matematica {

    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar dois números decimais
    public double somar(double da, double db) {
        return da + db;
    }
}

public class Exercicio8 {
    public static void main(String[] args) {

        Matematica mat = new Matematica();

        int a = 5;
        int b = 10;
        int c = 15;

        double da = 5.5;
        double db = 10.5;

        int somaDoisInteiros = mat.somar(a, b);
        System.out.println("A soma de dois numeros inteiros e: " + somaDoisInteiros);

        int somaTresInteiros = mat.somar(a, b, c);
        System.out.println("A soma de tres numeros inteiros e: " + somaTresInteiros);

        double somaDoisDecimais = mat.somar(da, db);
        System.out.println("A soma de dois numeros decimais e: " + somaDoisDecimais);
    }
}