package loiane.exercicio28a33.questao2;

public class TestaContaCorrente {
    
    public static void main(String[] args){
        
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.setNumero(824754);
        conta1.setLimite(5000);
        conta1.setEspecial(true);
        
        conta1.verificaEspecial();
        
        conta1.depositar(545);
        conta1.consultarSaldo();
        conta1.sacar(600);
        conta1.sacar(300);
        conta1.consultarSaldo();
        
    }
    
}
