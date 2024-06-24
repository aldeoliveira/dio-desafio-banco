import banco.Banco;
import banco.cliente.Cliente;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        // Criar conta
        Banco meuBanco = new Banco("Meu Banco Digital");
        Cliente fulano = meuBanco.registrarCliente("Fulano");
        ContaCorrente conta1 = meuBanco.criarContaCorrente(fulano);
        System.out.println(conta1);

        // Fazer depósito em uma conta
        conta1.depositar(500);
        System.out.println(conta1.getSaldo());

        // Fazer saque em uma conta
        conta1.sacar(100);
        System.out.println(conta1.getSaldo());

        // Fazer transferência entre contas
        Cliente beltrano = meuBanco.registrarCliente("Beltrano");
        ContaCorrente conta2 = meuBanco.criarContaCorrente(beltrano);
        System.out.println(conta2);
        conta2.depositar(400);
        conta2.transferir(conta1, 50);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        // Criar conta poupança
        ContaPoupanca conta3 = meuBanco.criarContaPoupanca(fulano);
        conta3.getNumero();
        conta1.transferir(conta3, 200);
        conta3.getSaldo();

        // Imprimir extratos das contas
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();
    }
}
