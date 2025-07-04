package desafio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando calculadora.\nDigite a operação que deseja realizar:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int option = Main.isInteger(scanner.nextLine());

        switch (option) {
            case 1:
                Main.performAddition();
                break;
            case 2:
                Main.performSubtraction();
                break;
            case 3:
                Main.performMultiplication();
                break;
            case 4:
                Main.performDivision();
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

    public static void performAddition(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número para a soma: ");
        float first_number = Main.isFloat(scanner.nextLine());

        System.out.print("\nInforme o segundo número para a soma: ");
        float second_number = Main.isFloat(scanner.nextLine());

        float result = first_number + second_number;
        System.out.printf("Resultado: %.2f", result);
    }

    public static void performSubtraction(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número para a subtração: ");
        float first_number = Main.isFloat(scanner.nextLine());

        System.out.print("\nInforme o segundo número, o qual será subtraído do primeiro: ");
        float second_number = Main.isFloat(scanner.nextLine());

        float result = first_number - second_number;
        System.out.printf("Resultado: %.2f", result);
    }

    public static void performMultiplication(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número para a multiplicação: ");
        float first_number = Main.isFloat(scanner.nextLine());

        System.out.print("\nInforme o segundo número da multiplicação: ");
        float second_number = Main.isFloat(scanner.nextLine());

        float result = first_number * second_number;
        System.out.printf("Resultado: %.2f", result);
    }

    public static void performDivision(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numerador: ");
        float first_number = Main.isFloat(scanner.nextLine());

        System.out.print("\nInforme o denominador: ");
        float second_number = Main.isFloat(scanner.nextLine());

        float result = first_number / second_number;
        System.out.printf("Resultado: %.2f", result);
    }
}