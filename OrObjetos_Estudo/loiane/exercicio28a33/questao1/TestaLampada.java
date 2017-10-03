package loiane.exercicio28a33.questao1;

public class TestaLampada {
    
    public static void main(String[] args) {
        
        Lampada lamp1 = new Lampada();
        
        System.out.println("A Lâmpada está " + (lamp1.isLigado() ? "ligada\n" : "desligada\n"));
        
        lamp1.ligar();
        
        System.out.println("A Lâmpada está " + (lamp1.isLigado() ? "ligada\n" : "desligada\n"));
        
    }
    
}
