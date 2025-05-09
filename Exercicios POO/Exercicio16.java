/*Enum
Crie um enum DiaDaSemana com os dias da semana. 
Em seguida, crie um método que exibe o dia seguinte ao dia passado 
como parâmetro. */

enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;
}

public class Exercicio16 {

    public static DiaDaSemana proximoDia(DiaDaSemana dia) {

    DiaDaSemana[] dias = DiaDaSemana.values();
    int proximo = (dia.ordinal() + 1) % dias.length;
    return dias[proximo];
}

    public static void main(String[] args) {
        
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        System.out.println("Dia atual: " + dia);
        System.out.println("Dia seguinte: " + proximoDia(dia));
    }
}