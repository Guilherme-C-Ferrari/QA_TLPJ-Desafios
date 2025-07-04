package desafio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);
        int value = 0;

        do {
            System.out.println("Insira um valor inteiro entre 1 e 10.");
            System.out.println("Caso deseje encerrar o programa digte 10.\n");
            value = Main.isInteger(scanner.nextLine());

            if (value >= 1 && value <= 10) {
                System.out.printf("Valor digitado: %d\n\n", value);
            } else {
                System.out.println("Valor inválido.\n\n");
            }
        } while (value != 10);

        System.out.println("\nNúmero 10 digitado. Programa encerrando.");
    }

    public static int isInteger(String input) {
        try {
            Integer.parseInt(input);
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
