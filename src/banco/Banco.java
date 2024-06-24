package banco;

import java.util.ArrayList;
import java.util.List;

import banco.cliente.Cliente;
import banco.contas.Conta;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.contas = new ArrayList<Conta>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente registrarCliente(String nomeCliente) {
        return new Cliente(nomeCliente);
    }

    public ContaCorrente criarContaCorrente(Cliente cliente) {
        ContaCorrente novaConta = new ContaCorrente(cliente);
        contas.add(novaConta);
        return novaConta;
    }

    public ContaPoupanca criarContaPoupanca(Cliente cliente) {
        ContaPoupanca novaConta = new ContaPoupanca(cliente);
        contas.add(novaConta);
        return novaConta;
    }
}
