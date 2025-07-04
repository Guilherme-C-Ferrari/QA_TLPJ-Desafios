package desafio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.println("Insira um valor inteiro entre 1 e 10.");
            value = Main.isInteger(scanner.nextLine());

            if (value < 1 || value > 10) {
                System.out.println("Valor inválido. Digite um valor válido para continuar.\n");
            } else {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(value + " * " + i + " = " + (value * i));
                }
            }
        } while (value < 1 || value > 10);
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
