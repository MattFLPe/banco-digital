// Classe abstrata onde se armazena métodos abstratos
public interface InterfaceConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
}
