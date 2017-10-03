package teste.tv;

public class TestaTV {

    public static void main(String[] args) {
        TV televisao1 = new TV("Samsung", 42);
        TV televisao2 = new TV("LG");
        TV televisao3 = new TV(32);
        TV televisao4 = new TV();

        System.out.println("\n" + TV.numTVs + " TVs existentes\n");
        
        televisao1.ligar();
        televisao1.aumentarVolume();
        televisao1.aumentarVolume();
        televisao1.setCanal(7);

        televisao1.status();
        televisao2.status();
        televisao3.status();
        televisao4.status();

    }

}
