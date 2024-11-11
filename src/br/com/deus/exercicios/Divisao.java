package br.com.deus.exercicios;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro Numero: ");
        int num1 = sc.nextInt();

        System.out.print("Segundo Numero: ");
        int num2 = sc.nextInt();

        try{
            int total = (num1/num2);
            System.out.println("Resultado: "+total);
        }catch(ArithmeticException e){
            System.out.println("Erro: "+e);
            System.out.println("Erro: Divisão por zero não é permitida.");

        }


        /*try{
            int total = (num1/num2);
            System.out.println("Resultado: " + total);
        }catch(ArithmeticException e){
        }*/
    }
}
