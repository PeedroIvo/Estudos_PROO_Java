package pacoteteste;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args){
        
        //Usando variavel constante PI
        final double PI = 3.141592;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio: ");
        double raio = input.nextDouble();
        
        double area = raio * raio * PI;
        
        System.out.println("O valor da área é: " + area);
        
    }
    
}
