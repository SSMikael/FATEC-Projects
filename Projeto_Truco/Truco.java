abstract class Baralho {

    private String naipe;
    private int valor;

    public Baralho(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }

}

abstract class Jogador {

    private String nome;
    private int pontos;
    private Baralho[] cartas;
    
    public Jogador(String nome, int pontos, Baralho[] cartas) {

        this.nome = nome;
        this.pontos = pontos;
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;

    }
    public Baralho[] getCartas() {
        return cartas;
    }
}

public class Truco {

    public static void main(String[] args) {
        
}
}
// 1 - criação do baralho, cartas e nipes.
// 2 - criação dos jogadores, 4 jogadores com nome, marcadores de pontos e cartas.
// 3 - criação das regras do truco(elevação da pontuação da rodada), manilhas e sistema de sinal no jogo.