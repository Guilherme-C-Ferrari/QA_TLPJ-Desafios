package desafio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.showOddValues();
    }

    public static void showOddValues() {
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[10];
        int odd_qnt = 0;

        for (int i = 0; i < v.length; i++) {
            while (true) {
                System.out.print("Digite um número inteiro para a posição " + i + " do vetor: ");
                try {
                    v[i] = isInteger(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("\nEntrada inválida. Por favor, digite um número inteiro.\n");
                }
            }
        }

        for (int odd : v) {
            if (odd % 2 != 0) {
                odd_qnt++;
            }
        }

        System.out.println("\nA quantidade de ímpares no vetor é: " + odd_qnt);
    }

    public static int isInteger(String input) {
        return Integer.parseInt(input);
    }
}