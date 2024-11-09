package br.com.alura.exercicios;/*
Crie uma classe br.com.alura.exercicios.ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.
*/

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
