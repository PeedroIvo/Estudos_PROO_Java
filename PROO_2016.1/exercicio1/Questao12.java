package exercicio1;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        boolean isAcertou = false;
        int opcao, chute;
        int qtdChutes = 1;
        int numSecreto = 98;

        System.out.println("[1]  3 chances");
        System.out.println("[2]  5 chances");
        System.out.println("[3]  8 chances\n");
        System.out.print("Selecione uma opção: ");
        Scanner input = new Scanner(System.in);
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                qtdChutes = 3;
                break;
            case 2:
                qtdChutes = 5;
                break;
            case 3:
                qtdChutes = 8;
                break;
        }

        for (int i = 1; i <= qtdChutes; i++) {
            System.out.println("\nChute " + i);
            System.out.print("Insira para tentar acertar o valor: ");
            chute = input.nextInt();

            if (chute == numSecreto) {
                System.out.println("Você acertou o número secreto em " + i + " tentativas");
                isAcertou = true;
                break;
            } else if (chute > numSecreto) {
                System.out.println("Valor acima do número secreto");

            } else {
                System.out.println("Valor abaixo do número secreto");

            }
        }

        if (!isAcertou) {
            System.out.println("\nVocê não acertou nenhuma vez");
        }
    }

}
