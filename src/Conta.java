public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int Sequencial = 1;
    private final Cliente cliente;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = Sequencial++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(saldo);
        contaDestino.depositar(valor);
    }

    public void imprimirInfo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void imprimirExtrato() {
    }
}

