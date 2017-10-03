package loiane.exercicio28a33.questao2;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void verificaEspecial() {
        if (this.especial) {
            System.out.println("A conta permite o uso de cheque especial!\n");
        } else {
            System.out.println("A conta NÃO permite o uso de cheque especial!\n");
        }
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta: " + this.saldo + "\n");
    }

    public void sacar(double valorSaque) {
        if (this.saldo - valorSaque >= 0) {
            this.saldo -= valorSaque;
        } else {
            System.out.println("Não é possível realizar o saque! (O valor do saque é maior que o saldo atual da conta)\n");
        }
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

}
