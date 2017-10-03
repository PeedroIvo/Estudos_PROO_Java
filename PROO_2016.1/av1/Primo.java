package av1;

import java.util.Scanner;

public class Primo {

    boolean verificaPrimo(int num) {
        int i, divisor = 0;

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor++;
            }
        }

        if (divisor == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Primo num = new Primo();

        int i, cont = 0, opcao;

        do {
            System.out.println("- Digite 1: Imprimir primos maiores que 50");
            System.out.println("- Digite 2: Imprmir primos menores que 50");
            System.out.println("- Digite 3: Imprimir todos os primos de 1 à 100");
            System.out.print("\nEscolha o tipo de impressão: ");

            opcao = input.nextInt();
            
            if((opcao != 1) && (opcao != 2) && (opcao != 3)){
                System.out.println("Opção inválida!\n");
            }
        } while ((opcao != 1) && (opcao != 2) && (opcao != 3));
        
        System.out.println();
        
        switch (opcao) {
            case 1:
                System.out.print("Números primos maiores que 50: ");
                for (i = 50; i < 100; i++) {
                    if (num.verificaPrimo(i)) {
                        System.out.print(i + " ");
                        cont++;
                    }
                }
                break;

            case 2:
                System.out.print("Números primos maiores que 50: ");
                for (i = 1; i < 50; i++) {
                    if (num.verificaPrimo(i)) {
                        System.out.print(i + " ");
                        cont++;
                    }
                }
                break;

            case 3:
                System.out.print("Números primos de 1 à 100: ");
                for (i = 1; i < 100; i++) {
                    if (num.verificaPrimo(i)) {
                        System.out.print(i + " ");
                        cont++;
                    }
                }
                break;
        }
        
        System.out.println("\nA quantidade de numeros primos na lista é: " + cont);
    }
}
