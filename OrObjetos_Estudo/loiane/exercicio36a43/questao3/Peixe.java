package loiane.exercicio36a43.questao3;

public class Peixe extends Animal {

    private final String caracteristicas;

    public Peixe() {
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        this.caracteristicas = "Barbatanas e Cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nCaracterísticas: " + this.caracteristicas;
    }

}
