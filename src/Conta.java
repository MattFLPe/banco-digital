public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int Sequencial = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = Sequencial++;
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
}
