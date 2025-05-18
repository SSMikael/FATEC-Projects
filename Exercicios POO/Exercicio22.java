/* . Collections
Crie uma classe Biblioteca que armazena uma lista de objetos Livro. 
Adicione métodos para adicionar, remover e buscar livros por título.
*/

import java.util.Scanner;

class Livro {

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
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
}

public class Exercicio22 {

    static Livro[] listaLivros = new Livro[8];
    static int indice = 0;

    public static void adicionarLivro(Livro livro) {
        if (indice < listaLivros.length) {
            listaLivros[indice] = livro;
            indice++;
        } else {
            System.out.println("Biblioteca cheia, remova algum livro antes de adicionar outro!");
        }
    }

    public static Livro buscarLivro(String titulo) {

        for (int i = 0; i < indice; i++) {
            
            if (listaLivros[i] != null && listaLivros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return listaLivros[i];
            }
        } return null;
    }



    public static void main(String[] args) {

        adicionarLivro(new Livro("O Senhor dos Aneis", "J.R.R. Tolkien"));
        adicionarLivro(new Livro("1984", "George Orwell"));
        adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        adicionarLivro(new Livro("A Revolucao dos Bichos", "George Orwell"));
        adicionarLivro(new Livro("O Pequeno Principe", "Antoine de Saint-Exupery"));

        System.out.println("Bem vindo a biblioteca!");

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
                
            System.out.println("Oque gostaria de fazer? \n 0 - Sair do sistema \n 1 - Adicionar livro \n 2 - Remover livro \n 3 - Buscar livro \n 4 - Mostrar todos os livros disponiveis");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
                continue;
            }
        
            switch (opcao) {

                case 1:
                    System.out.println("Digite o titulo do livro que deseja adicionar: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite o autor do livro que deseja adicionar: ");
                    String autor = scanner.nextLine();

                    adicionarLivro(new Livro(titulo, autor));

                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o titulo do livro que deseja remover: ");

                    String tituloRemover = scanner.nextLine();

                    Livro livroRemover = buscarLivro(tituloRemover);

                    if (livroRemover != null) {
                        for (int i = 0; i < indice; i++) {
                            if (listaLivros[i].getTitulo().equalsIgnoreCase(tituloRemover)) {
                                listaLivros[i] = null;
                                System.out.println("Livro removido com sucesso!");
                            break;
                        }
                    }

                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                break;

                case 3:
                    System.out.println("Digite o titulo do livro que deseja buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Livro livroBuscar = buscarLivro(tituloBuscar);
                    if (livroBuscar != null) {
                        System.out.println("Livro encontrado: " + livroBuscar.getTitulo() + " - " + livroBuscar.getAutor());
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                break;

                case 4:
                    System.out.println("Livros disponíveis na biblioteca:");
                    for (int i = 0; i < indice; i++) {
                        if (listaLivros[i] != null) {
                            System.out.println(listaLivros[i].getTitulo() + " - " + listaLivros[i].getAutor());
                        }
                    }
                break;

                case 0:

                    System.out.println("Fim da execucao do sistema.");

                break;
            }
        }
        scanner.close();
    }
}