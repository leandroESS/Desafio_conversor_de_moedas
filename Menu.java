import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    static void requisicao(String endereco, String destino, double valor) throws IOException, InterruptedException {
       try {
           HttpClient client = HttpClient.newHttpClient(); //
           HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

           String retornoJson = response.body();

           Gson gson = new Gson();
           Conversor conversor = gson.fromJson(retornoJson, Conversor.class);
           Map<String, Double> conversaoTipo = conversor.getConversionRates();

           double usdToEurRate = conversaoTipo.get(destino);
           double amountInEur = valor * usdToEurRate;
           System.out.println("O valor " + valor + " corresponde ao valor final de: " + amountInEur);
           //System.out.println(amountInEur);
       } catch (IOException | InterruptedException e){
           System.out.println(":( Houve um erro durante a consulta à API. :(");
           e.printStackTrace();
       }
    }

    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner menu = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        boolean running = true;
        String endereco;
        double Valor;


        while (running) {
            System.out.println("Seja bem vindo co conversor de moeda !!\n");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>>  Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Sair\n");
            System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA !!\n");


            int opcao = menu.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("1) Dólar =>> Peso argentino\n");
                    endereco = "https://v6.exchangerate-api.com/v6/fd3a58a018bb700615676603/latest/" + "USD";
                    System.out.println("Digite o valor a ser convertido\n");
                    Valor = valor.nextDouble();
                    requisicao(endereco, "ARS", Valor);
                    break;
                case 2:
                    System.out.println("2) Peso argentino =>>  Dólar\n");
                    endereco = "https://v6.exchangerate-api.com/v6/fd3a58a018bb700615676603/latest/" + "ARS";
                    System.out.println("Digite o valor a ser convertido\n");
                    Valor = valor.nextDouble();
                    requisicao(endereco, "USD", Valor);
                    break;
                case 3:
                    System.out.println("3) Dólar =>> Real brasileiro\n");
                    endereco = "https://v6.exchangerate-api.com/v6/fd3a58a018bb700615676603/latest/" + "USD";
                    System.out.println("Digite o valor a ser convertido\n");
                    Valor = valor.nextDouble();
                    requisicao(endereco, "BRL", Valor);
                    break;

                case 4:
                    System.out.println("4) Real brasileiro =>> Dólar\n");
                    endereco = "https://v6.exchangerate-api.com/v6/fd3a58a018bb700615676603/latest/" + "BRL";
                    System.out.println("Digite o valor a ser convertido\n");
                    Valor = valor.nextDouble();
                    requisicao(endereco, "USD", Valor);
                    break;

                case 5:
                    System.out.println("5) Dólar =>> Peso Colombiano\n");
                    endereco = "https://v6.exchangerate-api.com/v6/fd3a58a018bb700615676603/latest/" + "USD";
                    System.out.println("Digite o valor a ser convertido\n");
                    Valor = valor.nextDouble();
                    requisicao(endereco, "COP", Valor);
                    break;

                case 6:
                    System.out.println("6) Peso Colombiano =>> Dólar\n");
                    endereco = "https://v6.exchangerate-api.com/v6/fd3a58a018bb700615676603/latest/" + "COP";
                    System.out.println("Digite o valor a ser convertido\n");
                    Valor = valor.nextDouble();
                    requisicao(endereco, "USD", Valor);
                    break;

                case 7:
                    System.out.println("Saindo.....\n");
                    running = false;
                    break;

                case 8:
                    System.out.println("Opção inválida, tente novamente\n");
                    break;
            }

        }


    }
}
