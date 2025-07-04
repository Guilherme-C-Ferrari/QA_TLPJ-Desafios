package desafio02;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao mercado.\nDigite abaixo o que deseja comprar:");
        System.out.println("1 - Cerveja (R$ 10,00)");
        System.out.println("2 - Refrigerante (R$ 8,00)");
        System.out.println("3 - Água (R$ 4,00)");
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
                    Main.purchaseDefinition(option);
                    System.out.println("\nCompra efetuada com sucesso.");
                }
                break;
            case 2, 3:
                Main.purchaseDefinition(option);
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

    public static void purchaseDefinition(int item) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nQuantas unidades deseja comprar?");
        String input = scanner.nextLine();
        int qnt = Main.isInteger(input);

        int discount_type = 0;
        if (qnt > 0) {
            discount_type = Main.discountDefinition(qnt);
        } else {
            System.out.println("\nOpção inválida");
            System.exit(0);
        }

        Main.priceCalculation(item, qnt, discount_type);
    }

    public static int discountDefinition(int qnt) {
        int discount_type;
        if (qnt > 0 && qnt <= 10) {
            discount_type = 0;
        } else if (qnt > 10 && qnt <= 20) {
            discount_type = 1;
        } else if (qnt > 20 && qnt <= 50) {
            discount_type = 2;
        } else {
            discount_type = 3;
        }
        return discount_type;
    }

    public static void priceCalculation(int item, int qnt, int discount_type) {
        String name = "";
        double value = 0;
        double discount_value = 0;
        double final_value;

        value = switch (item) {
            case 1 -> {
                name = "Cerveja";
                yield 10.00;
            }
            case 2 -> {
                name = "Refrigerante";
                yield 8.00;
            }
            case 3 -> {
                name = "Água";
                yield 4.00;
            }
            default -> value;
        };

        discount_value = switch (discount_type) {
            case 0 -> 1;
            case 1 -> 0.9;
            case 2 -> 0.8;
            case 3 -> 0.75;
            default -> discount_value;
        };
        final_value = value * qnt * discount_value;

        System.out.printf(
                "Foram compradas %d unidades de %s por R$ %.2f\n",
                qnt, name, final_value
        );
    }
}