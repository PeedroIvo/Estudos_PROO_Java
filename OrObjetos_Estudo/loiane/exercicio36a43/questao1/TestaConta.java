package loiane.exercicio36a43.questao1;

public class TestaConta {
    
    public static void main(String[] args){
        
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaEspecial especial = new ContaEspecial();
        
        poupanca.setNomeCliente("Pedro Ivo");
        poupanca.setNumConta("12345-678");
        poupanca.setDiaRendimento(0.05);
        
        especial.setNomeCliente("Ivo Pedro");
        especial.setNumConta("87654-321");
        especial.setLimite(500);
        
        poupanca.depositar(1000);
        poupanca.calcularNovoSaldo();
        System.out.println("1 dia após o deposito na poupança o saldo atual é: R$" + poupanca.getSaldo() + "\n");
        poupanca.sacar(1500);
        poupanca.sacar(1000);
        
        especial.depositar(1500);
        especial.sacar(700);
        especial.sacar(500);
        
        System.out.println(poupanca + "\n");
        System.out.println(especial);
    }
    
}
