/*
Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
*/


package br.com.deus.exercicios;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        //(100°C × 9/5) + 32 = 212°F
        //F = (9/5 × °C) + 32.
        return (celsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        // c = (°F - 32) × 5/9
        return (fahrenheit - 32) * 9 / 5;
    }
}
