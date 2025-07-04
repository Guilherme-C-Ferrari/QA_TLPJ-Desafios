package desafio10;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        float grade_average;
        Float grade1;
        Float grade2;
        String status_student;

        while (loop) {
            System.out.print("Informe a primeira nota do aluno: ");
            grade1 = Main.isFloat(scanner.nextLine());

            if (grade1 == null) {
                System.out.println("Valor inválido. Digite um número válido.\n");
                continue;
            }

            System.out.print("\nInforme a segunda nota do aluno: ");
            grade2 = Main.isFloat(scanner.nextLine());

            if (grade2 == null) {
                System.out.println("Valor inválido. Digite um número válido.\n");
                continue;
            }

            grade_average = Main.calculateGradeAverage(grade1, grade2);
            status_student = Main.checkStatus(grade_average);
            System.out.printf("Média: %.2f\nStatus: %s", grade_average, status_student);

            do {
                System.out.print("\n\nDeseja continuar e calcular outra média? (S/N)\n");
                String input = scanner.nextLine();
                if (Objects.equals(input, "S") || Objects.equals(input, "s")) {
                    break;
                } else if (Objects.equals(input, "N") || Objects.equals(input, "n")) {
                    loop = false;
                } else {
                    System.out.print("Opção inválida.");
                }
            } while (loop);
        }
    }

    public static Float isFloat(String input) {
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static float calculateGradeAverage(float grade1, float grade2) {
        return ((grade1 + grade2) / 2);
    }

    public static String checkStatus(float grade_average) {
        if (grade_average >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}