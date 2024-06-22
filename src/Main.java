public class Main {
    public static void main(String[] args) {
        Cliente Anon = new Cliente();
        Anon.setNome("Anon");

        Conta cc = new ContaCorrente(Anon);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Anon);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
