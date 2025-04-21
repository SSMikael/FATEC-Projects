import java.util.Scanner;

class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite a idade: ");
    int idade = scanner.nextInt();

    scanner.close();

        Pessoa pessoa = new Pessoa(nome, idade); {

            System.out.println("Nome>: " + pessoa.getNome());
            System.out.println("Idade>: " + pessoa.getIdade());

        }
    }
}