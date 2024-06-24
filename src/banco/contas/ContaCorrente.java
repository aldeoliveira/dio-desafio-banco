package banco.contas;

import banco.cliente.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfos();
    }

    @Override
    public String toString() {
        return String.format(
            "ContaCorrente{agencia=%d, numero=%d, cliente='%s', saldo=%.2f}",
            getAgencia(), getNumero(), getCliente().getNome(), getSaldo()
        );
    }
}
