// Herança Simples
// Crie uma classe Animal com um método fazerSom(). 
// Em seguida, crie uma classe Cachorro que herda de Animal e sobrescreve o método fazerSom().

class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }

}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au");
    }

}

public class Exercicio7 {
    public static void main(String[] args) {

    Animal cachorro = new Cachorro();
    
    cachorro.fazerSom();
    }
}