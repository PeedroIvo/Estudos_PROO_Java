package pacoteteste;

import java.util.Scanner;

public class MétodoInverteVetor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Indique o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] abc = new int[tamanho];
        int[] xyz = new int[abc.length];

        int i;

        System.out.print("\nDigite os " + abc.length + " valores do vetor: ");

        for (i = 0; i < abc.length; i++) {

            abc[i] = input.nextInt();

        }

        xyz = inverteVetor(abc);

        System.out.println("");

        for (i = 0; i < abc.length; i++) {

            System.out.print(abc[i] + " ");

        }

        System.out.println("");

        for (i = 0; i < xyz.length; i++) {

            System.out.print(xyz[i] + " ");

        }

    }

    public static int[] inverteVetor(int[] abc) {

        int[] xyz = new int[abc.length];
        int i, j;

        for (i = 0, j = abc.length - 1; i < abc.length; i++, j--) {

            xyz[j] = abc[i];

        }

        return xyz;

    }

}
