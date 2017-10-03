package loiane.exercicio36a43.questao3;

public class Mamifero extends Animal{
    
    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nAlimento: " + this.alimento;
    }
}
