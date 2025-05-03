/*Lista de Objetos
Crie uma classe Carrinho DeCompras que armazena uma lista de objetos Produto. 
Adicione métodos para adicionar, remover e listar produtos. */

class Carrinho {

    int quantItens;
    double valorTotal;
    Produto[] listaProdutos;
    int index = 0; // (index): define qual a posição do array (do produto na lista)
    int tamanho; // define qual o tamanho do array
    boolean status = false; //define o status do carrinho (inativo ou ativo) (util para quando um produto do carrinho não estiver mais disponível).

    public Carrinho(int tamanho) {

        this.tamanho = tamanho;
        this.listaProdutos = new Produto[tamanho];
    }

    public Carrinho() {

        this.tamanho = 10;
        this.listaProdutos = new Produto[tamanho];
    }

    
}

class Produto {


}