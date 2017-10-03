package teste.animais;

public class Papagaio extends Ave implements AnimalDomesticado {

    @Override
    public void voar() {
        //return "Voando";
    }

    @Override
    public String emitirSom() {
        return "Prrr prrr!";
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

}
