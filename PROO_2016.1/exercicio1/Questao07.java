package exercicio1;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char sexo;

        do {
            System.out.print("Informe o sexo (M ou F): ");
            sexo = input.next().charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                System.out.println("O sexo não é válido!");
            }

        } while (sexo != 'M' && sexo != 'F');

        System.out.print("Informe o peso: ");
        double peso = input.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        if (sexo == 'M') {
            if (imc < 20.7) {
                System.out.println("IMC: " + imc + " (Abaixo do peso)");
            } else if (imc >= 20.7 && imc < 26.4) {
                System.out.println("IMC: " + imc + " (Peso ideal)");
            } else if (imc >= 26.4 && imc < 27.8) {
                System.out.println("IMC: " + imc + " (Um pouco acima do peso)");
            } else if (imc >= 27.8 && imc < 32.3) {
                System.out.println("IMC: " + imc + " (Acima do peso ideal)");
            } else {
                System.out.println("IMC: " + imc + " (Obeso)");
            }
        } else if (sexo == 'F') {
            if (imc < 19.1) {
                System.out.println("IMC: " + imc + " (Abaixo do peso)");
            } else if (imc >= 19.1 && imc < 25.8) {
                System.out.println("IMC: " + imc + " (Peso ideal)");
            } else if (imc >= 25.8 && imc < 27.3) {
                System.out.println("IMC: " + imc + " (Um pouco acima do peso)");
            } else if (imc >= 27.3 && imc < 31.1) {
                System.out.println("IMC: " + imc + " (Acima do peso ideal)");
            } else {
                System.out.println("IMC: " + imc + " (Obeso)");;
            }
        }
    }
}
