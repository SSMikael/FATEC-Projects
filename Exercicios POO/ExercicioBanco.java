//Criar uma classe banco com os atributos numero da conta, tipo, nome do dono, saldo, status e os 
// metodos abrir conta, fechar conta, depositar, sacar e pagar mensalidade.
// criar dois clientes.

// (Conta poupança ou conta corrente) (Não pode fechar conta com saldo negativo ou positivo) 
// (abrir conta corrente ganha bonificação de R$ 50,00 e poupança R$ 150,00) (usuario 1 deposita R$ 300 e usuario 2 R$ 500)
// (saque somente com saldo positivo) (Conta corrente paga 12 reais de mensalidade e poupança 20 reais)

class ContaBanco {

    private int numeroConta;
    protected String tipo;
    private String nomeDono;
    private boolean status;
    private double saldo;

    // Inicializando as variáveis. (Com paramentros)
    //Constructor com parametros.
    public ContaBanco(int numeroConta, String tipo, String nomeDono, double saldo, boolean status) {

        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.nomeDono = nomeDono;
        this.saldo = saldo;
        this.status = status;

    }

    // Getters e Setters.
    public int numeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeDono() {
        return this.nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Metodos da classe ContaBanco. (Abrir, fechar conta, depositar, sacar e pagar mensalidade)

    
    public void abrirConta(String tipo) {
        //não esquecer de adicionar logica de mudança do numero da conta. numero da conta = numero da conta + 1
    }

    public void fecharConta() {

    }

    public void depositar(double valor) {

    }

    public void sacar(double valor) {

    }

    public void pagarMensalidade() {

        // pode ser melhorado unificando os dois ifs em um só.
        if (this.saldo >= 12) {

            if (tipo.equals("Conta Corrente")) {
                
                this.saldo -= 12;
                System.out.println("Mensalidade de R$ 12,00 paga com sucesso");
                System.out.println("Seu saldo atual e de R$ " + this.saldo);

            }

        } else { 

            System.out.println("Saldo insulficiente para pagar a mensalidade");

        }

        
            
        if (this.saldo >= 20) {
            
            if (tipo.equals("Conta Poupanca")) {

            this.saldo -= 20;
            System.out.println("Mensalidade de R$ 20,00 paga com sucesso");
            System.out.println("Seu saldo atual e de R$ " + this.saldo);

            }
            
        } else {

            System.out.println("Saldo insulficiente para pagar a mensalidade");

        }
    }

    // Inicializando as variáveis. (Sem paramentros)
    //Constructor padrão.
    //Constructor abertura de conta.
    
    public ContaBanco() {

        this.numeroConta = 0;
        this.tipo = "";
        this.nomeDono = "Desconhecido";
        this.saldo = 0.0;
        this.status = false;

        System.out.println("Conta fechada");

        // Definindo status inicial da conta.
        if (status == false) {
            System.out.println("Conta fechada");
        } else {
            System.out.println("Conta aberta");
        }

        //Definindo bonificação de acordo com o tipo de conta. (mudar logica de bonificação para o metodo abrir conta)
        if (tipo.equals("Conta Corrente")) {
            this.saldo = 50;
            System.out.println("Conta corrente recebeu bonificacao de abertura de R$ 50,00");
        } else if (tipo.equals("Conta Poupanca")) {
            this.saldo = 150;
            System.out.println("Conta poupanca recebeu bonificacao de abertura de R$ 150,00");
        }
    }
}
