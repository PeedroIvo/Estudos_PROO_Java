package pacoteteste;

import java.util.Scanner;

public class StringIntro {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira seu primeiro nome: ");
        String primeiroNome = input.next();
        
        System.out.print("Insira seu último nome: ");
        String ultimoNome = input.next();
        
        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();
        
        System.out.println("\nOlá, " + primeiroNome + " " + ultimoNome + "!\nVocê tem " + idade + " anos de idade.");
        
    }
    
}
