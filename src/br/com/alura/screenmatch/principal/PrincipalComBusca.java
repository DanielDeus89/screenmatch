package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Filme: ");
        String filme = scanner.nextLine();

        String apiKey = "cfeae105";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=" + filme + "&apikey=" + apiKey))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        System.out.println(json);

        Gson gson = new Gson();

        Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
        System.out.println();
        System.out.println(meuTitulo);
    }
}
