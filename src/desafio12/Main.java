package desafio12;

public class Main {
    public static void main(String[] args) {
        Main.showOddValues();
    }

    public static void showOddValues() {
        int[] v = {1,2,3,4,5,6,7,8,9,10};
        int odd_qnt = 0;

        for (int odd : v) {
            if (odd % 2 != 0) {
                odd_qnt++;
            }
        }

        System.out.println("A quantidade de ímpares no vetor é: " + odd_qnt);
    }
}
