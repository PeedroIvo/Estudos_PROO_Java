package exercicio1;

public class Questao10 {

    public static void main(String[] args) {
        int fatorial = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "! = ");

            fatorial *= i;
            
            System.out.println(fatorial);
        }
    }
}
