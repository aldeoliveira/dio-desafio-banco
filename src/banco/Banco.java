package banco;

import java.util.List;

import banco.contas.Conta;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
