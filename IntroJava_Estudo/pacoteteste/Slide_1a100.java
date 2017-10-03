package pacoteteste;

public class Slide_1a100 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.println(" - PAR");
            } else {
                System.out.println(" - ÍMPAR");
            }
        }

    }

}
