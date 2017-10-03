package pacoteteste;

import java.util.Scanner;

public class MyBubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de elementos do vetor: ");
        int numElementos = input.nextInt();

        int[] vetor = new int[numElementos];

        int aux, i, j;

        System.out.println("Digite os elementos do vetor: ");

        for (i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();
        }

        for (i = 0; i < vetor.length; i++) {
            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for (i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        
        System.out.println("");
    }
    
}
