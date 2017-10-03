package loiane.exercicio36a43.questao1;

public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento;

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.diaRendimento));
    }

    @Override
    public String toString() {
        return "Conta Poupança\n" + super.toString() + "\nTaxa de Rendimento/Dia: " + diaRendimento + "%";
    }

}
