package br.com.deus.exercicios;

public class AnimalDog extends Animal {

    public void abanarRabo(){
        System.out.println("Cachorro tambem abana o Rabo");
    }

    @Override
    public void makeSound() {
        System.out.println("O cachorro Late: Au au");
    }

}
