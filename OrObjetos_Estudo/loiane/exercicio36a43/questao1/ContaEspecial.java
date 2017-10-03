package loiane.exercicio36a43.questao1;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > this.limite) {
            System.out.println("Não é possível realizar o saque de R$" + valorSaque + "! (O valor do saque é maior que limite de saque permitido)\n");
        } else if (this.getSaldo() - valorSaque >= 0) {
            this.setSaldo(this.getSaldo() - valorSaque);
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\n");
        } else {
            System.out.println("Não é possível realizar o saque de R$" + valorSaque + "! (O valor do saque é maior que o saldo atual da conta)\n");
        }
    }

    @Override
    public String toString() {
        return "Conta Especial\n" + super.toString() + "\nValor Limite de Saque: R$" + this.limite;
    }
}
