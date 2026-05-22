public static void main(String[] args) {
    String[] listaNomes = new String[3];

    Scanner scanner = new Scanner(System.in);

    lerTresNomes(scanner)

    escolherNomes(scanner, listaNomes)
}

public static String[] lerTresNomes(Scanner scanner) {

    String[] listaNomes = new String[3];

    while(true) {
        System.out.println("Digite 3 nomes, em sequência: ");

        String dividirNomes = scanner.nextLine();

        listaNomes = dividirNomes.split("[ ,]+");

        if (listaNomes.length == 3) {
            break;
        } else if (listaNomes.length > 3) {
            System.out.println("Você digitou mais que 3 nomes, precisamos que digite 3.");
        } else {
            System.out.println("Você digitou menos de 3 nomes, precisamos que digite 3.");
        }
    }
}

public static void escolherNomes (Scanner scanner, String[] listaNomes) {

    while(true){
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



