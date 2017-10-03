package pacoteteste;

import java.util.Scanner;

public class Métodos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double areaTotal = 0;
        char opçao;

        do {
            System.out.print("Informe o valor da base: ");
            double base = pegaDado();
            System.out.print("Informe o valor da altura: ");
            double altura = pegaDado();

            areaTotal += calculaArea(base, altura);

            do {
                System.out.print("\nDeseja inserir os dados de mais um retângulo? S ou N? ");
                opçao = input.next().charAt(0);
            } while (opçao != 's' && opçao != 'S' && opçao != 'n' && opçao != 'N');

        } while (opçao == 's' || opçao == 'S');

        System.out.println("\nA soma das áreas dos retângulos apresentados é: " + areaTotal);

    }

    public static double pegaDado() {

        Scanner input = new Scanner(System.in);

        double dado = input.nextDouble();

        return dado;

    }

    public static double calculaArea(double base, double altura) {

        double areaRetangulo = base * altura;

        System.out.println("A área deste retângulo é: " + areaRetangulo);

        return areaRetangulo;

    }
}
