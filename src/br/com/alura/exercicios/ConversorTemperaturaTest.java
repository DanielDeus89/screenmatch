package br.com.alura.exercicios;

import java.util.Scanner;

public class ConversorTemperaturaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();

        System.out.print("Insira uma temperatura Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println(celsius + "C em Fahrenheit: " + temperatura.celsiusParaFahrenheit(celsius));


        System.out.print("Insira uma temperatura Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.println(fahrenheit + "Fahrenheit em C: " + temperatura.fahrenheitParaCelsius(fahrenheit));

    }

}
