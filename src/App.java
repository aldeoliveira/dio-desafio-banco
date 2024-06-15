public class App {
    public static void main(String[] args) throws Exception {
        Cliente andre = new Cliente();

        Conta cc = new ContaCorrente(andre);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(andre);
        cc.transferir(cp, 100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
