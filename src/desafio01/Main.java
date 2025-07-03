package desafio01;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao mercado.\nDigite abaixo o que deseja comprar:");
        System.out.println("1 - Cerveja");
        System.out.println("2 - Refrigerante");
        System.out.println("3 - Água");
        System.out.print("Opção: ");

        String input = scanner.nextLine();
        int option = Main.isInteger(input);

        switch (option) {
            case 1:
                System.out.println("\nQual a sua idade?");
                System.out.print("\nDigite sua idade: ");

                input = scanner.nextLine();
                int age = Main.isInteger(input);

                if (age < 18) {
                    System.out.println("\nCompra negada.");
                } else {
                    System.out.println("\nCompra efetuada com sucesso.");
                }
                break;
            case 2, 3:
                System.out.println("\nCompra efetuada com sucesso.");
                break;
            default:
                System.out.println("\nOpção inválida");
                break;
        }
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
