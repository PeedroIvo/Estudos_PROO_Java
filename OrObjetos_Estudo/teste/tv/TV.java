package teste.tv;

import java.util.Scanner;

public class TV {

    Scanner input = new Scanner(System.in);

    public static int numTVs = 0;

    private final String fabricante;
    private final double polegadas;
    private boolean ligado;
    private int volume;
    private int canal;

    TV() {
        System.out.print("Informe o fabricante da TV " + (TV.numTVs + 1) + ": ");
        this.fabricante = input.nextLine();        

        System.out.print("Informe as polegadas da TV " + (TV.numTVs + 1) + ": ");
        this.polegadas = input.nextDouble();

        TV.numTVs++;
    }

    public TV(String fabricante) {
        System.out.print("Informe as polegadas da TV " + (TV.numTVs + 1) + ": ");
        this.polegadas = input.nextDouble();

        this.fabricante = fabricante;
        TV.numTVs++;
    }

    public TV(double polegadas) {
        System.out.print("Informe o fabricante da TV " + (TV.numTVs + 1) + ": ");
        this.fabricante = input.nextLine();

        this.polegadas = polegadas;
        TV.numTVs++;
    }

    public TV(String fabricante, int polegadas) {
        this.fabricante = fabricante;
        this.polegadas = polegadas;
        TV.numTVs++;
    }

    public void aumentarVolume() {
        if (this.volume < 10) {
            this.volume++;
        }
    }

    public void dimunuirVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void ligar() {
        this.ligado = this.ligado != true;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return this.canal;
    }

    public double getPolegadas() {
        return this.polegadas;
    }

    public void status() {
        System.out.println("A TV " + this.fabricante + " de " + this.polegadas + "\" está " + (this.ligado ? "LIGADA" : "DESLIGADA\n"));
        if (this.ligado) {
            System.out.println("- O volume está em " + this.volume);
            System.out.println("- O canal atual é " + this.canal + "\n");
        }
    }
}
