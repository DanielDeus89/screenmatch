package br.com.deus.exercicios;

public class AnimalTest {
    public static void main(String[] args) {

        AnimalDog dog = new AnimalDog();
        AnimalCat cat = new AnimalCat();

        dog.makeSound();
        dog.abanarRabo();
        System.out.println();
        cat.makeSound();
        cat.arranharMoveis();
    }
}
