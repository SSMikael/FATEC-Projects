/*Polimorfismo
Crie uma classe Animal com um método fazerSom(). 
Em seguida, crie classes Cachorro e Gato que sobrescrevem esse método. 
Use polimorfismo para chamar o método correto. */

class Animal {

    public void fazerSom() {

        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    @Override

    public void fazerSom() {

        System.out.println("O cachorro late.");
    }
}

class Gato extends Animal {

    @Override

    public void fazerSom() {

        System.out.println("O gato mia.");
    }
}

public class Exercicio19 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.fazerSom();
        cachorro.fazerSom();
        gato.fazerSom();
    }
}