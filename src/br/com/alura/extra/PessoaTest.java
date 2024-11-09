/*
Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
Adicione pelo menos três pessoas à lista utilizando o método add.

Imprima o tamanho da lista utilizando o método size.

Imprima a primeira pessoa da lista utilizando o método get.
Imprima a lista completa
*/

package br.com.alura.extra;

import java.util.ArrayList;

public class PessoaTest {
    public static void main(String[] args) {

        var pessoa0 = new Pessoa("Daniel",35);
        var pessoa1 = new Pessoa("Milene",34);
        var pessoa2 = new Pessoa("HEitor",5);
        var pessoa3 = new Pessoa("ìsis",1);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(pessoa0);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Tamnha da Lista: "+ pessoas.size());
        System.out.println("Primeira Pessoa: "+ pessoas.getFirst());

        System.out.println(pessoas.toString());

        for(int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i).toString());
        }

        for(Pessoa p: pessoas){
            System.out.println(p.toString());
        }
    }
}
