class Endereco {

    public String rua;
    public String cidade;
    public String estado;
    public String cep;


    public Endereco(String rua, String cidade, String estado, String cep) {

        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;

    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco() {

        this.rua = ("");
        this.cidade = ("");
        this.estado = ("");
        this.cep = ("");

    }

    public void mostrarEndereco() {

        System.out.println("Rua: " + this.getRua());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Estado: " + this.getEstado());
        System.out.println("Cep: " + this.getCep());
    }
}

class Pessoa{

    public String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {

        this.nome = nome;
        this.endereco = endereco;

    }

    public Pessoa() {

        this.nome = "";
        this.endereco = new Endereco();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void mostrarPessoa() {

        System.out.println("Nome: " + this.getNome());
        System.out.println();

        System.out.println("Endereco: ");
        this.endereco.mostrarEndereco();

    }
}

// Uso das chaves na craição de objetos é opcional.
// Estudar o uso de toString() para imprimir os atributos de um objeto.

public class Exercicio9 {
    public static void main(String[] args) {


        Endereco endereco1 = new Endereco(); {

            endereco1.setRua("Rua FATEC");
            endereco1.setCidade("Mogi das Cruzes");
            endereco1.setEstado("Sao Paulo");
            endereco1.setCep("08700-000");

            System.out.println();
            endereco1.mostrarEndereco();
        }

         Pessoa pessoa1 = new Pessoa(); {

            pessoa1.setNome("João");
            pessoa1.setEndereco(endereco1);

            pessoa1.mostrarPessoa();

        }
    }  
}

//Código funcionando.