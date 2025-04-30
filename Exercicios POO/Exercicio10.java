/*Array de Objetos
Crie uma classe Produto com atributos nome e preco. 
Em seguida, crie um array de Produto e exiba os detalhes de cada produto. */

class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Exercicio10 {

    public static void main(String[] args) {

        Produto[] listaProdutos = new Produto[5];

        listaProdutos[0] = new Produto("Faca", 10.00);
        listaProdutos[1] = new Produto("Garfo", 5.00);
        listaProdutos[2] = new Produto("Colher", 7.00);
        listaProdutos[3] = new Produto("Copo", 11.00);
        listaProdutos[4] = new Produto("Prato", 18.00);

        for (int i = 0; i < listaProdutos.length; i++) {

            System.out.println("Produto: " + listaProdutos[i].getNome());
            System.out.println("Preco: " + listaProdutos[i].getPreco());
            System.out.println();

        }
    }
}