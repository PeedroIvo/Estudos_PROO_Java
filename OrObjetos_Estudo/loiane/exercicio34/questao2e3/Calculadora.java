package loiane.exercicio34.questao2e3;

public class Calculadora {
    
    //Questão 2
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static int potencia(int num1, int num2) {
        int total = 1;
        for (int i = 1; i <= num2; i++) {
            total *= num1;
        }
        return total;
    }
    
    //Questão 3
    public static int fatorialNaoRecursivo(int num) {
        if (num == 0) {
            return 1;
        }
        
        int resultado = 1;
        for (int i = num; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
    
    //Fatorial com Recursividade
    public static int fatorialRecursivo(int num) {
        if (num == 0){
            return 1;
        }
        
        return num * fatorialRecursivo(num-1);
    }

}
