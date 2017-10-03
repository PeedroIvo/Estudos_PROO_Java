package loiane.exercicio28a33.questao1;

public class Lampada {
    
    private String modelo;
    private String cor;
    private String tipo;
    private int consumo_Watt;
    private int vidaUtil_Horas;
    private boolean ligado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getConsumo_Watt() {
        return consumo_Watt;
    }

    public void setConsumo_Watt(int consumo_Watt) {
        this.consumo_Watt = consumo_Watt;
    }

    public int getVidaUtil_Horas() {
        return vidaUtil_Horas;
    }

    public void setVidaUtil_Horas(int vidaUtil_Horas) {
        this.vidaUtil_Horas = vidaUtil_Horas;
    }
    
    public void ligar(){
        this.ligado = this.ligado != true;
    }

    public boolean isLigado() {
        return ligado;
    }
    
}
