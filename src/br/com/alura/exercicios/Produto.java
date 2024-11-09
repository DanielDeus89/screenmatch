package br.com.alura.exercicios;/*
Desenvolva uma classe br.com.alura.exercicios.Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
*/

public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double AplicaDesconto(double desconto) {
       return this.preco - ((desconto / 100) * preco);
    }
}
