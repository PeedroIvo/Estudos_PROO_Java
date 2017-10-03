package pacoteteste;

import java.util.Scanner;

public class VetoresBi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas linhas terá o vetor? ");
        int linhas = input.nextInt();
        
        System.out.print("Quantas colunas terá o vetor? ");
        int colunas = input.nextInt();
        
        int[][] vetorBi = new int[linhas][colunas];
        
        int i, j;
        
        for(i = 0; i < vetorBi.length; i++){
            for(j = 0; j < vetorBi[i].length; j++){
                System.out.print("[" + i + "][" + j + "] = ");
                vetorBi[i][j] = input.nextInt();
            }
        }
        
        System.out.println();
        
        for(i = 0; i < vetorBi.length; i++){
            for(j = 0; j < vetorBi[i].length; j++){
                System.out.print("[" + i + "][" + j + "] = " + vetorBi[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
