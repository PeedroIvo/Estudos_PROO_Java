package pacoteteste;

import java.util.Scanner;

public class OperadorCondicional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, maior;
        
        System.out.print("Digite o valor de a: ");
        a = input.nextInt();
        
        System.out.print("Digite o valor de b: ");
        b = input.nextInt();

        maior = (a > b) ? a : b;

        System.out.println(maior);

    }
}
