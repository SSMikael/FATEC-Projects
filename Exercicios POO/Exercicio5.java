//5. Objetos
//Crie uma classe Livro com atributos titulo, autor e anoPublicacao. 
//Instancie dois objetos dessa classe e exiba seus detalhes.

class Livro {

    public String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {

        System.out.println("Titulo do livro: " + this.getTitulo());
        System.out.println("Autor do livro: " + this.getAutor());
        System.out.println("Ano de publicacao: " + this.getAnoPublicacao());
    }
}

public class Exercicio5 {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Java Como Programar", "Deitel", 1996); {

        livro1.exibirDetalhes();

        }
    }
}