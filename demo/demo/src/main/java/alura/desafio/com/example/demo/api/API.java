package alura.desafio.com.example.demo.api;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class API {
    public static void main(String[] args) {


        String endereco ="https://gutendex.com/";
        String book="/books?search=dom+casmurro";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();

            System.out.println("\n\n");
            System.out.println(endereco);
            System.out.println("\n"+book);

        } catch (ErroConsultaException e) {
            System.out.println("Erro!");
            System.out.println(e.getMessage());
        }
    }
}



