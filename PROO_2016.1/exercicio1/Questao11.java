package exercicio1;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Insira um numero: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                int res = i * j;
                System.out.print(" " + res);
            }
            System.out.println();
        }
    }
}
