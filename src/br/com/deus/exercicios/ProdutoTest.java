package br.com.deus.exercicios;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        String nome;
        double preco;
        double desconto;

        System.out.print("Digite o nome do produto: ");
        nome = sc.nextLine();
        produto.setNome(nome);

        System.out.print("Digite o valor do produto: ");
        preco = sc.nextDouble();
        produto.setPreco(preco);

        System.out.print("% do desconto: ");
        desconto = sc.nextDouble();

        System.out.println();
        System.out.printf("br.com.alura.exercicios.Produto: %s ", produto.getNome());
        System.out.printf("%nPreco total: R$%.2f", produto.getPreco());
        System.out.printf("%nVAlor com desconto: R$%.2f", produto.AplicaDesconto(desconto));
}
}
