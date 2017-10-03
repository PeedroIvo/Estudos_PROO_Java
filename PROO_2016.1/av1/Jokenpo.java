package av1;

import java.util.Scanner;

public class Jokenpo {

    Scanner input = new Scanner(System.in);

    private String jogador1;
    private String jogador2;
    private int qtdPartidas;
    private int qtdVitoriasJogador1;
    private int qtdVitoriasJogador2;
    private int qtdEmpates;

    public Jokenpo() {
        this.telaBoasVindas();
    }

    public Jokenpo(String jogador1, String jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.telaBoasVindas();
    }

    public void telaBoasVindas() {
        if (this.jogador1 == null) {
            System.out.print("Digite o nome do Jogador 1: ");
            this.jogador1 = input.nextLine();
        }

        if (this.jogador2 == null) {
            System.out.print("Digite o nome do Jogador 2: ");
            this.jogador2 = input.nextLine();
        }

        System.out.println("\n**** Bem vindos " + this.jogador1 + " e " + this.jogador2 + " ao jogo de Jokenpo ****");

        this.escolheQuantidadePartidas();
    }

    public void escolheQuantidadePartidas() {
        System.out.println("- Digite 1: Cinco partidas");
        System.out.println("- Digite 2: Sete partidas");
        System.out.println("- Digite 3: Nove partidas");
        System.out.print("\nEscolha a quantidade de partidas desejada: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                this.qtdPartidas = 5;
                break;
            case 2:
                this.qtdPartidas = 7;
                break;
            case 3:
                this.qtdPartidas = 9;
                break;
            default:
                System.out.println("\nOpcao invalida! Digite 1, 2 ou 3!");
                this.escolheQuantidadePartidas();
                break;
        }
    }

    public void jogar() {
        int numDaPartida = 1;

        while ((numDaPartida <= this.qtdPartidas) && (this.qtdVitoriasJogador1 <= (qtdPartidas / 2)) && (this.qtdVitoriasJogador2 <= (qtdPartidas / 2))) {
            System.out.println("\nPartida de no." + numDaPartida + " de " + this.qtdPartidas);
            System.out.println("- Digite 1: PEDRA");
            System.out.println("- Digite 2: PAPEL");
            System.out.println("- Digite 3: TESOURA\n");
            
            int jogada1;
            int jogada2;
            
            do {
                System.out.print(this.jogador1 + ", faça sua jogada: ");
                jogada1 = input.nextInt();
                
                if (jogada1 != 1 && jogada1 !=2 && jogada1 !=3){
                    System.out.println("\nOpcao invalida! Digite 1, 2 ou 3!");
                }
            } while (jogada1 != 1 && jogada1 !=2 && jogada1 !=3);
            
            do {
                System.out.print(this.jogador2 + ", faça sua jogada: ");
                jogada2 = input.nextInt();
                
                if (jogada2 != 1 && jogada2 !=2 && jogada2 !=3){
                    System.out.println("\nOpcao invalida! Digite 1, 2 ou 3!");
                }
            }  while (jogada2 != 1 && jogada2 !=2 && jogada2 !=3);

            int resultado = this.validarJogadas(jogada1, jogada2);

            switch (resultado) {
                case 1:
                    this.qtdVitoriasJogador1++;
                    System.out.println("\n" + this.jogador1 + " venceu a partida!");
                    break;
                case 2:
                    this.qtdVitoriasJogador2++;
                    System.out.println("\n" + this.jogador2 + " venceu a partida!");
                    break;
                case 3:
                    this.qtdEmpates++;
                    System.out.println("\nPartida Empatada!");
                    break;
            }

            numDaPartida++;
        }
        
        this.placarFinal();
    }

    public int validarJogadas(int jogada1, int jogada2) {
        if (((jogada1 == 1) && (jogada2 == 3)) || ((jogada1 == 2) && (jogada2 == 1)) || ((jogada1 == 3) && (jogada2 == 2))) {
            return 1;
        } else if (((jogada2 == 1) && (jogada1 == 3)) || ((jogada2 == 2) && (jogada1 == 1)) || ((jogada2 == 3) && (jogada1 == 2))) {
            return 2;
        } else if (((jogada1 == 1) && (jogada2 == 1)) || ((jogada1 == 2) && (jogada2 == 2)) || ((jogada1 == 3) && (jogada2 == 3))) {
            return 3;
        }
        return 0;
    }

    public void placarFinal() {
        System.out.print("\nJOGO ENCERRADO! ");
        if (this.qtdVitoriasJogador1 > this.qtdVitoriasJogador2) {
            System.out.println("Vitória de " + this.jogador1 + "!");
        } else if (this.qtdVitoriasJogador1 < this.qtdVitoriasJogador2) {
            System.out.println("Vitória de " + this.jogador2 + "!");
        } else {
            System.out.println("Empate!");
        }
        
        System.out.println("\nPlacar Final:");
        System.out.println("- Vitórias de " + this.jogador1 + ": " + this.qtdVitoriasJogador1);
        System.out.println("- Vitórias de " + this.jogador2 + ": " + this.qtdVitoriasJogador2);
        System.out.println("- Empates: " + this.qtdEmpates);
    }

    public static void main(String[] args) {

        Jokenpo jokenpo = new Jokenpo();
        jokenpo.jogar();

    }

}
