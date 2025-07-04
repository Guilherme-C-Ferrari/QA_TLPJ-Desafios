package desafio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);
        float grade1;
        float grade2;
        float grade3;
        float grade_average;
        String status;

        System.out.print("Informe a primeira nota do aluno: ");
        String input = scanner.nextLine();
        grade1 = Main.isFloat(input);

        System.out.print("\nInforme a segunda nota do aluno: ");
        input = scanner.nextLine();
        grade2 = Main.isFloat(input);

        System.out.print("\nInforme a terceira nota do aluno: ");
        input = scanner.nextLine();
        grade3 = Main.isFloat(input);

        grade_average = Main.calculateGradeAverage(grade1, grade2, grade3);
        status = Main.checkStatus(grade_average);
        System.out.printf("Média: %.2f\nStatus: %s", grade_average, status);
    }

    public static float calculateGradeAverage (float grade1, float grade2, float grade3) {
        return ((grade1 + grade2 + grade3) / 3);
    }

    public static float isFloat(String input) {
        try {
            Float.parseFloat(input);
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida");
            System.exit(0);
            return -1;
        }
    }

    public static String checkStatus(float grade_average) {
        if (grade_average >= 7) {
            return "Aprovado";
        } else if (grade_average >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
