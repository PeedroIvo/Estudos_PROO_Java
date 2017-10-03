package pacoteteste;

import java.util.Scanner;

public class AreaRetangulo {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double base, altura, area;
        
        System.out.print("Informe o valor da base: ");
        base = input.nextDouble();
        
        System.out.print("Informe o valor da altura: ");
        altura = input.nextDouble();
        
        area = base*altura;
        
        System.out.println("A área do retangulo é: " + area);
        
    }
    
}
