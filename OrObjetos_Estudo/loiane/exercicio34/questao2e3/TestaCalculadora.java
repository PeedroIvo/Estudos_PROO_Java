package loiane.exercicio34.questao2e3;

public class TestaCalculadora {
    
    public static void main(String[] args) {
        
        //Teste - Questão 2
        ImprimirResultado(Calculadora.somar(1, 1));
        ImprimirResultado(Calculadora.subtrair(2, 1));
        ImprimirResultado(Calculadora.multiplicar(2, 2));
        ImprimirResultado(Calculadora.dividir(4, 2));
        ImprimirResultado(Calculadora.potencia(2, 3));
        
        //Teste - Questão 3
        ImprimirResultado(Calculadora.fatorialNaoRecursivo(5));
        ImprimirResultado(Calculadora.fatorialNaoRecursivo(0));
        
        //Teste - Fatorial com Recursividade
        ImprimirResultado(Calculadora.fatorialRecursivo(3));
        ImprimirResultado(Calculadora.fatorialRecursivo(0));
    }
    
    static void ImprimirResultado(int resultado) {
        System.out.println(resultado);
    }
    
}
