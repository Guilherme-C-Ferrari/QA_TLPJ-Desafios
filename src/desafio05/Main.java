package desafio05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        String salesman_name;
        float property_value;
        float commission_value;

        System.out.println("Bem-vindo vendedor, poderia informar seu nome?");
        salesman_name = scanner.nextLine();

        System.out.println("\nInforme o valor do imóvel: ");
        property_value = Main.isFloat(scanner.nextLine());
        commission_value = Main.commissionCalculation(property_value);

        System.out.printf("\nNome do vendedor: %s", salesman_name);
        System.out.printf("\nValor do imóvel: %.2f", property_value);
        System.out.printf("\nValor da comissão: %.2f\n", commission_value);
    }

    public static float isFloat(String input) {
        try {
            Float.parseFloat(input);
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido");
            System.exit(0);
            return -1;
        }
    }

    public static float commissionCalculation(float property_value) {
        if (property_value >= 50000.00) {
            return (float) (property_value * 0.2);
        } else if (property_value >= 30000.00) {
            return (float) (property_value * 0.15);
        } else if (property_value > 0) {
            return (float) (property_value * 0.1);
        } else {
            System.out.println("Valor inválido");
            System.exit(0);
            return -1;
        }
    }
}
