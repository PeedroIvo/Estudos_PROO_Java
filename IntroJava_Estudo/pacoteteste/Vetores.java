package pacoteteste;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = input.nextInt();

        String[] nomeAlunos = new String[numAlunos];
        double[] notaAlunos = new double[numAlunos];

        for (int i = 0; i < notaAlunos.length; i++) {
            input.nextLine(); //Gambiarra like "getchar();"
            System.out.print("\nAluno " + (i + 1) + "\nNome: ");
            nomeAlunos[i] = input.nextLine();
            System.out.print("Nota: ");
            notaAlunos[i] = input.nextDouble();
        }

        for (int i = 0; i < notaAlunos.length; i++) {
            System.out.println("\nNome: " + nomeAlunos[i] + "\n -> Nota: " + notaAlunos[i]);
        }
    }

}
