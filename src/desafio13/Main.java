package desafio13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        String input;
        int test;

        for (int i = 0; i < names.length; i++) {
            System.out.print("Digite um nome para adicionar a lista: ");
            input = scanner.nextLine();
            names[i] = input;
        }

        System.out.print("\n\nDigite um nome para achar na lista: ");
        input = scanner.nextLine();
        test = Arrays.binarySearch(names, input);

        if (test >= 0) {
            System.out.println("\nAchei.");
        } else {
            System.out.println("\nNão achei.");
        }
    }
}
