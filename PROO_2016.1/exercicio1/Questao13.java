package exercicio1;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        int alunos, i = 1;
        double nota, media;
        double total = 0;

        System.out.print("Insira a quantidade de alunos: ");
        Scanner input = new Scanner(System.in);
        alunos = input.nextInt();

        while (i <= alunos) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = input.nextDouble();
            total = total + nota;
            ++i;
        }

        media = (total / alunos);
        System.out.println("\nMedia da sala: " + media);
    }

}
