package teste.animais;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String tamanho;
    private String raça;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

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
        return "Au au!";
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
