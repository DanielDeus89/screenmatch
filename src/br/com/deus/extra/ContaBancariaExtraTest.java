package br.com.deus.extra;

public class ContaBancariaExtraTest {
    public static void main(String[] args) {
        ContaBancariaExtra contaSimples = new ContaBancariaExtra(100);
        System.out.println("=== Conta Bancária ===");
        contaSimples.depositar(50);
        contaSimples.sacar(30);
        System.out.printf("Saldo final da conta bancária: R$%.2f%n%n", contaSimples.consultarSaldo());

        ContaBancariaCorrente ContaBancariaCorrente = new ContaBancariaCorrente(200);
        System.out.println("=== Conta Corrente ===");
        ContaBancariaCorrente.depositar(100);
        ContaBancariaCorrente.cobrarTarifaMensal();
        ContaBancariaCorrente.sacar(50);
        ContaBancariaCorrente.cobrarTarifaMensal();
        System.out.printf("Saldo final da conta corrente: R$%.2f%n", ContaBancariaCorrente.consultarSaldo());
    }
}
