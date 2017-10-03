package pacoteteste;

import java.util.Scanner;

public class GramaParaKilograma {

    public static void main(String[] arrgs) {

        Scanner input = new Scanner(System.in);

        int gramas, kilos, gramasResto;

        System.out.print("Insira o valor em gramas: ");
        gramas = input.nextInt();

        kilos = gramas/1000;
        gramasResto = gramas%1000;
        
        System.out.println(gramas + " Gramas é igual a: " + kilos + " Kilos + " + gramasResto + " Gramas");

    }

}
