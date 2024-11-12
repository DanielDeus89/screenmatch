package br.com.deus.screenmatch.principal;

import br.com.deus.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.deus.screenmatch.modelos.Titulo;
import br.com.deus.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);


/*        System.out.print("Digite o nome do Filme: ");
        String filme = scanner.nextLine();*/


        String apiKey = "cfeae105";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.omdbapi.com/?t=" + "divertidamente".replace(" ","+") + "&apikey=" + apiKey))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdg = gson.fromJson(response.body(), TituloOmdb.class);
            System.out.println();
            System.out.println(meuTituloOmdg);


            Titulo meuTitulo = new Titulo(meuTituloOmdg);
            System.out.println(meuTitulo);


        } catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizado Corretamente.");

    }
}
