import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] listaNomes = lerTresNomes(scanner); /*Parametros é como se fosse: "toma aqui pra você funcionar", a função solicita algo para seu funcionamento */

    escolherNomes(scanner, listaNomes);

    scanner.close();
}

public static String[] lerTresNomes(Scanner scanner) { /*Se não tem o void é pq retorna algo, trocar break por return.*/
    /*A função pede um scanner emprestado, não vai retornar o que foi digitado no scanner.*/
    String[] listaNomes = new String[3];

    while (true) {
        System.out.println("Digite 3 nomes, em sequência: ");

        String dividirNomes = scanner.nextLine();

        listaNomes = dividirNomes.split("[ ,]+");

        if (listaNomes.length == 3) {
            return listaNomes; /* Especifique sempre o que você vai retorna do método*/
        } else if (listaNomes.length > 3) {
            System.out.println("Você digitou mais que 3 nomes, precisamos que digite 3.");
        } else {
            System.out.println("Você digitou menos de 3 nomes, precisamos que digite 3.");
        }
    }
}

    public static void escolherNomes (Scanner scanner, String[]listaNomes){

        while (true) {
            System.out.println("Você deseja imprimir qual nome da lista (primeiro, segundo, terceiro, todos): ");

            String resposta = scanner.nextLine().trim();

            if (resposta.equals("primeiro")) {
                System.out.println(listaNomes[0]);
                break;
            } else if (resposta.equals("segundo")) {
                System.out.println(listaNomes[1]);
                break;
            } else if (resposta.equals("terceiro")) {
                System.out.println(listaNomes[2]);
                break;
            } else if (resposta.equals("todos")) {
                System.out.println(listaNomes[0]);
                System.out.println(listaNomes[1]);
                System.out.println(listaNomes[2]);
                break;
            } else {
                System.out.println("Você não digitou uma das opções apresentadas, tente novamente.");
            }
        }
    }
}

