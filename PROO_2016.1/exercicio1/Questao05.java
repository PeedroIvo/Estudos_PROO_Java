package exercicio1;

import java.util.Scanner;

public class Questao05 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite os lucros do 1o trimestre: ");
        double trimestre1 = input.nextDouble();
        
        System.out.print("Digite os lucros do 2o trimestre: ");
        double trimestre2 = input.nextDouble();
        
        System.out.print("Digite os lucros do 3o trimestre: ");
        double trimestre3 = input.nextDouble();
        
        System.out.print("Digite os lucros do 4o trimestre: ");
        double trimestre4 = input.nextDouble();
        
        if(trimestre1 >= trimestre2 && trimestre1 >= trimestre3 && trimestre1 >= trimestre4){
            System.out.println("\nO trimestre que obteve o MAIOR lucro foi o 1o!");
        }
        else if(trimestre2 >= trimestre1 && trimestre2 >= trimestre3 && trimestre2 >= trimestre4){
            System.out.println("\nO trimestre que obteve o MAIOR lucro foi o 2o!");
        }
        else if(trimestre3 >= trimestre1 && trimestre3 >= trimestre2 && trimestre3 >= trimestre4){
            System.out.println("\nO trimestre que obteve o MAIOR lucro foi o 3o!");
        }
        else if(trimestre4 >= trimestre1 && trimestre4 >= trimestre2 && trimestre4 >= trimestre3){
            System.out.println("\nO trimestre que obteve o MAIOR lucro foi o 4o!");
        }
        
        if(trimestre1 <= trimestre2 && trimestre1 <= trimestre3 && trimestre1 <= trimestre4){
            System.out.println("O trimestre que obteve o MENOR lucro foi o 1o!");
        }
        else if(trimestre2 <= trimestre1 && trimestre2 <= trimestre3 && trimestre2 <= trimestre4){
            System.out.println("O trimestre que obteve o MENOR lucro foi o 2o!");
        }
        else if(trimestre3 <= trimestre1 && trimestre3 <= trimestre2 && trimestre3 <= trimestre4){
            System.out.println("O trimestre que obteve o MENOR lucro foi o 3o!");
        }
        else if(trimestre4 <= trimestre1 && trimestre4 <= trimestre2 && trimestre4 <= trimestre3){
            System.out.println("O trimestre que obteve o MENOR lucro foi o 4o!");
        }
        
        double media = (trimestre1 + trimestre2 + trimestre3 + trimestre4)/4;
        
        System.out.println("\nA media dos lucros do ano é: " + media);
    }
    
}
