package br.com.alura.exercicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Pessoa(String nome, int idade, String cidade){}

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Jundiai\",\"estado\":\"Jundiai\"}";

        Gson gson = new GsonBuilder().setLenient().create();

        RecordPessoa pessoa = gson.fromJson(jsonPessoa, RecordPessoa.class);

        System.out.println(pessoa);
    }
}
