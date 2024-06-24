import banco.Banco;
import banco.cliente.Cliente;
import banco.contas.ContaCorrente;

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

    }
}
