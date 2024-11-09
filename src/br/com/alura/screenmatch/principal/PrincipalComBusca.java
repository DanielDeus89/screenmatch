package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
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
        Scanner leitura = new Scanner(System.in);

        //https://www.omdbapi.com/?apikey=cfeae105&t=Matrix
        System.out.print("Digite o filmes para Busca: ");
        String busca = leitura.nextLine();
        String endereco = "https://www.omdbapi.com/?apikey=cfeae105&t=" + busca.replace(" ", "+") ;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //System.out.println(response.body());

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy
                            .UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb =
                    gson.fromJson(response.body(), TituloOmdb.class);

            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);

        }catch (IllegalArgumentException e ){
            System.out.println("Aconteceu um erro.");
            System.out.println(e.getMessage());
        }catch (ErroDeConversaoDeAnoException e){
            System.out.println("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
    }
}
