package exercicio1;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo = 100;
        double valor;
        int opcao;

        System.out.print("[1]Saldo [2]Deposito [3]Saque [4]Sair\nInforme a opção desejada: ");
        opcao = input.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é: " + saldo);
                break;
            case 2:
                System.out.print("Informe o valor a ser depositado: ");
                valor = input.nextDouble();
                saldo += valor;
                System.out.println("Seu novo saldo é: " + saldo);
                break;
            case 3:
                System.out.print("Informe o valor a ser sacado: ");
                valor = input.nextDouble();
                
                if (valor > saldo) {
                    System.out.println("Valor não permitido para saque");
                    break;
                } else {
                    saldo -= valor;
                    System.out.println("O valor retirado foi: " + valor);
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                }
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");

        }
    }
}
