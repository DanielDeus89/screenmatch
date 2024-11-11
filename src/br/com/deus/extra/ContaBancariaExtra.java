/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/

package br.com.deus.extra;

import java.util.InputMismatchException;

public class ContaBancariaExtra {
    private double saldo;

    // Construtor para inicializar o saldo da conta
    public ContaBancariaExtra(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para consultar o saldo da conta
    public double consultarSaldo() {
        return saldo;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado. Saldo atual: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");

        }
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado. Saldo atual: R$%.2f%n", valor, saldo);
        } else  {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
            throw new InputMismatchException("Saldo insuficiente ou valor inválido para saque.");
        }
    }
}
