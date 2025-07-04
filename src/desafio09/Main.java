package desafio09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);
        Float first_value;
        Float second_value;
        float result;

        while (true) {
            System.out.print("Informe o numerador: ");
            first_value = isFloat(scanner.nextLine());

            if (first_value == null) {
                System.out.println("Valor inválido. Digite um número válido.\n");
                continue;
            }

            System.out.print("\nInforme o denominador: ");
            second_value = isFloat(scanner.nextLine());

            if (second_value == null) {
                System.out.println("Valor inválido. Digite um número válido.\n");
                continue;
            } else if (second_value == 0) {
                System.out.println("O denominador não pode ser zero.\n");
                continue;
            }

            result = first_value / second_value;
            System.out.printf("Resultado: %.2f\n", result);
            break;
        }
    }

    public static Float isFloat(String input) {
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}