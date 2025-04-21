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
    
        Pessoa pessoa = new Pessoa("Desconhecido", 0); {

            System.out.println("Nome>: " + pessoa.getNome());
            System.out.println("Idade>: " + pessoa.getIdade());

        }
    }
}