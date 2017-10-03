package exercicio1;

import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números inteiros quer armazenar no array? ");
        int qtdNumeros = input.nextInt();
        
        System.out.println();

        int numeros[] = new int[qtdNumeros];
        int num;

        for (int i = 0; i < numeros.length; i++) {
            boolean jaExiste = false;

            do {
                System.out.print((i + 1) + "º Número: ");
                num = input.nextInt();

                for (int j = 0; j < i; j++) {
                    if (num == numeros[j]) {
                        jaExiste = true;
                        System.out.println("Este número já existe no array!");
                        break;
                    } else {
                        jaExiste = false;
                    }
                }
            } while (jaExiste);

            numeros[i] = num;
        }

        System.out.print("\nImprimindo Array: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

}
