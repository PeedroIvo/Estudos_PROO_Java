package exercicio1;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o sexo: ");
        char sexo = input.next().charAt(0);

        if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
            System.out.println("O sexo é válido!");
        } else {
            System.out.println("O sexo não é válido!");
        }
    }
}
