/*Equals e HashCode
Crie uma classe Funcionario com atributos id e nome.
Sobrescreva os métodos equals() e hashCode() para comparar funcionários pelo id. */

class Funcionario {

    private String nome;
    private int id;

    public Funcionario(String nome, int id) {

        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Funcionario that = (Funcionario) obj;
        return this.id == that.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Id: " + this.id;
    }
}

public class Exercicio12 {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Mikael", 0101);
        Funcionario funcionario2 = new Funcionario("Carlos", 0102);
   

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());

        System.out.println("funcionario1.equals(funcionario2): " + funcionario1.equals(funcionario2));
        System.out.println("funcionario1.hashCode(): " + funcionario1.hashCode());
    }
}