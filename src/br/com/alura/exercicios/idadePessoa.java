package br.com.alura.exercicios;/*
Crie uma classe br.com.alura.exercicios.idadePessoa com os atributos privados nome e idade.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
*/

public class idadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(String nome,int idade) {
            if (idade >= 18) {
                System.out.print(nome + "Maior de idade: "+idade);
            }
            else {
                System.out.print(nome+ "Menor de idade: "+idade);
            }

    }
}
