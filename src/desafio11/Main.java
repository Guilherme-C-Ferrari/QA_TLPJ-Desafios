package desafio11;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.startMenu();
    }

    public static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        int i = 0;

        while (i < 3) {
            System.out.print("Informe o usuário: ");
            username = scanner.nextLine();

            System.out.print("\nInforme a senha: ");
            password = scanner.nextLine();

            if (Objects.equals(username,"aluno") && Objects.equals(password, "segredo")) {
                System.out.print("\nLogin efetuado. Bem vindo.\n");
                break;
            } else {
                System.out.print("\nUsuário e/ou senha inválido(s).\n\n");
                i++;
            }
        }

        if (i >= 3) {
            System.out.print("Muitas falhas consecutivas. Login bloqueado.\n");
        }
    }
}