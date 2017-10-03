package loiane.exercicio36a43.questao1;

public abstract class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo = 0;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        if (this.saldo - valorSaque >= 0) {
            this.saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\n");
        } else {
            System.out.println("Não é possível realizar o saque de R$" + valorSaque + "! (O valor do saque é maior que o saldo atual da conta)\n");
        }
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Deposito de R$" + valorDeposito + " realizado com sucesso!\n");
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + this.nomeCliente + "\nNumero da Conta: " + this.numConta + "\nSaldo Atual: R$" + this.saldo;
    }

}
