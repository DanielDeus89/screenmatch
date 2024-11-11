/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/

package br.com.deus.extra;

public class ContaBancariaCorrente extends ContaBancariaExtra{
    private static final double TARIFA_MENSAL = 15.00;


    public ContaBancariaCorrente(double saldoInicial) {
        super(saldoInicial);

   }

   public void cobrarTarifaMensal(){
        if(consultarSaldo() >= TARIFA_MENSAL){
            sacar(TARIFA_MENSAL);
            System.out.printf("Tarifa mensal de R$%.2f cobrada. Saldo atual: R$%.2f%n", TARIFA_MENSAL, consultarSaldo());
        }else{
            System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
        }
    }


}
