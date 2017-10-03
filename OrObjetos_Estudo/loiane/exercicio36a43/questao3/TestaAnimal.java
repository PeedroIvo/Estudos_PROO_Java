package loiane.exercicio36a43.questao3;

public class TestaAnimal {

    public static void main(String[] args) {

        Mamifero animal1 = new Mamifero();
        Peixe animal2 = new Peixe();
        Mamifero animal3 = new Mamifero();

        animal1.setNome("Camelo");
        animal1.setComprimento_cm(150);
        animal1.setCor("Amarelo");
        animal1.setAmbiente("Deserto/Terra");
        animal1.setVelocidade_ms(2);
        animal1.setAlimento("Vegetais");
        
        animal2.setNome("Tubarão");
        animal2.setComprimento_cm(300);
        animal2.setVelocidade_ms(1.5);
        
        animal3.setNome("Urso-do-Canadá");
        animal3.setComprimento_cm(180);
        animal3.setCor("Vermelho");
        animal3.setAmbiente("Terra");
        animal3.setVelocidade_ms(0.5);
        animal3.setAlimento("Mel");

        System.out.println("Zoo:\n---------------------\n" + animal1 + "\n---------------------\n" + animal2 + "\n---------------------\n" + animal3);

    }
}
