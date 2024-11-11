package br.com.deus.exercicios;

public class AnimalCat extends Animal {
    public void arranharMoveis(){
        System.out.println("Gato arranha os moveis");
    }


    @Override
    public void makeSound(){
        System.out.println("Sou um gato faço Mi au");
    }
}
