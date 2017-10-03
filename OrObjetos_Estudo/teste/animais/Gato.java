package teste.animais;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void amamentar() {
        //return "Amamentando";
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void levarVeterinario() {
    }

    @Override
    public void chamarVaterinario() {
    }

    @Override
    public void brincar() {
    }

    @Override
    public void levarPassear() {
    }
}
