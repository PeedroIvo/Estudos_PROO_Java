package pacoteteste;

import java.util.Scanner;
import java.util.Random;

public class AcerteONumero {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int tentativas = 10, chute;
        int numSecreto = aleatorio.nextInt(10);
        boolean acertou = false;

        while (tentativas > 0 && acertou == false) {

            System.out.print("Digite o seu chute (0 à 10): ");
            chute = input.nextInt();

            if (chute > numSecreto) {
                tentativas--;
                System.out.println("Numero Grande! Tente um menor! (" + tentativas + " tentativas restantes)\n");
            } else if (chute < numSecreto) {
                tentativas--;
                System.out.println("Numero Pequeno! Tente um maior! (" + tentativas + " tentativas restantes)\n");
            } else {
                System.out.println("Você acertou!");
                acertou = true;
            }

        }

        if (tentativas == 0) {
            System.out.println("Seu número de tentativas foi esgotado!\nO numero secreto é: " + numSecreto);
        }

    }

}
