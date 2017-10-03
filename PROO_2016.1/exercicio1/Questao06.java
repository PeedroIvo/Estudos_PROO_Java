package exercicio1;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a Nota 1: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a Nota 2: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a Nota 3: ");
        double nota3 = input.nextDouble();

        System.out.print("Digite a Nota 4: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\nMedia Final: " + media);
        
        if(media >= 0 && media <= 4){
            System.out.println("INSUFICIENTE!");
        }
        else if(media > 4 && media < 6){
            System.out.println("RUIM!");
        }
        else if(media >= 6 && media < 8){
            System.out.println("REGULAR!");
        }
        else if(media >= 8 && media <= 10){
            System.out.println("BOM!");
        }
    }
}
