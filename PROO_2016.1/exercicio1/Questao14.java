package exercicio1;

public class Questao14 {
    public static void main(String[] args) {
        int i = 1;
        
        while (i < 100) {
            int divisor = 0;
            int j = 1;
            
            while (j <= i) {
                if (i % j == 0) {
                    divisor++;
                }
                
                j++;
            }

            if (divisor == 2) {
                System.out.print(i + " ");
            }
        
            i++;
        }
    }
}
