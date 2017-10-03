package loiane.exercicio36.questao1;

import java.util.Scanner;

public class TestaAgenda {

    public static void main(String[] args) {

        Agenda agenda1 = new Agenda();
        Contato[] contatos1 = new Contato[3];

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da agenda: ");
        agenda1.setNome(input.nextLine());

        for (int i = 0; i < contatos1.length; i++) {
            Contato contato = new Contato();

            System.out.println("\nDigite as informações do contato " + (i + 1));

            System.out.print("Nome: ");
            contato.setNome(input.nextLine());
            
            System.out.print("Telefone: ");
            contato.setTelefone(input.nextLine());

            System.out.print("Email: ");
            contato.setEmail(input.nextLine());
            
            contatos1[i] = contato;
        }

        agenda1.setContatos(contatos1);

        agenda1.imprimeAgenda();
    }
}
