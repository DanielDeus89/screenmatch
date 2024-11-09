package br.com.alura.exercicios;

import java.util.Scanner;

public class idadePessoaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        idadePessoa p1 = new idadePessoa();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        p1.setNome(nome);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        p1.setIdade(idade);

        p1.verificarIdade(nome, idade);


    }
}
