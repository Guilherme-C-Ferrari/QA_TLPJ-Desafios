package desafio07;

public class Main {
    public static void main(String[] args) {
        Main.sumValues();
    }

    public static void sumValues() {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + sum);
    }
}
