package br.com.deus.exercicios;

public class Calculadora {
    private float number = 0;

    public Calculadora(float number) {
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public float getDouble(float number) {
        return number * number;
    }
}
