package loiane.exercicio36a43.questao3;

public abstract class Animal {

    private String nome;
    private int comprimento_cm;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade_ms;

    public Animal() {
        this.numPatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento_cm() {
        return comprimento_cm;
    }

    public void setComprimento_cm(int comprimento_cm) {
        this.comprimento_cm = comprimento_cm;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade_ms() {
        return velocidade_ms;
    }

    public void setVelocidade_ms(double velocidade_ms) {
        this.velocidade_ms = velocidade_ms;
    }

    @Override
    public String toString() {
        return "Animal: " + this.nome
                + "\nComprimento: " + this.comprimento_cm + " cm"
                + "\nPatas: " + this.numPatas
                + "\nCor: " + this.cor
                + "\nAmbiente: " + this.ambiente
                + "\nVelocidade: " + this.velocidade_ms + " m/s";
    }

}
