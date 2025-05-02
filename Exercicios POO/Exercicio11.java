/* To String
Crie uma classe Aluno com atributos nome e matricula.
Sobrescreva o método toString() para exibir os detalhes do
aluno. */

class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {

        this.nome = nome;
        this.matricula = matricula;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Matricula: " + this.matricula;
    }
}

public class Exercicio11 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Joao", "1001001");

        System.out.println(aluno1.toString());

    }
}