# Desafio Banco

Criação de um banco digital com Java e orientação a objetos.

## Motivação

Esta alicação atende aos requisitos do Desafio de Projeto _Criando um Banco Digital com Java e Orientação de Objetos_ da DIO.

## Stack

Java 22.0.1.

## Execução

Escolha uma pasta para o projeto e faça um clone do repositório:

```git clone git@github.com:aldeoliveira/dio-desafio-banco.git```

## Funcionamento

Fornece a classe Banco, que é composto por vários clientes e várias contas.

```
Banco meuBanco = new Banco("Nome do Banco");
```

Permite registrar clientes:

```
Cliente fulano = meuBanco.registrarCliente("Fulano de Tal");
```

Permite abrir uma conta corrente ou uma conta poupança. Para criar a conta, é preciso já ter instanciado um cliente, para que seja o titular da conta.

```
ContaCorrente conta1 = meuBanco.criarContaCorrente(fulano);
```

As contas possuem um número da agência, que é definido por padrão, e um número próprio da conta, que é definido de acordo com a ordem de instanciamento e nunca é repetido. É possível ver o saldo ```.getSaldo()```, fazer saques ```.sacar(valor)```, depósitos ```.depositar(valor)``` , ou transferências entre contas ```.transferir(valor, contaDestino)```.

Além disso, também é possível imprimir todas as informações de uma conta com o método ```.imprimirInfos()```.

<hr>

__*Bom proveito!*__
