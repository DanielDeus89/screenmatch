/*
Crie uma classe Livro que contenha atributos como
título, autor e um objeto representando a editora.

Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro.
*/


package br.com.alura.exercicios;

import com.google.gson.Gson;

public class RecordLivro {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
    public record Editora(String nome, String cidade) { }
    public record Livro(String titulo, String autor, Editora editora) { }

}