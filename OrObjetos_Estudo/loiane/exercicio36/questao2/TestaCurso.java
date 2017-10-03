package loiane.exercicio36.questao2;

import java.util.Scanner;

public class TestaCurso {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        curso1.setNome(input.nextLine());

        System.out.print("Digite o horario do curso: ");
        curso1.setHorario(input.nextLine());

        System.out.println("\nProfessor");

        Professor professor1 = new Professor();

        System.out.print("- Digite o nome do professor: ");
        professor1.setNome(input.nextLine());

        System.out.print("- Digite o departamento do professor: ");
        professor1.setDepartamento(input.nextLine());

        System.out.print("- Digite o email do professor: ");
        professor1.setEmail(input.nextLine());

        curso1.setProfessor(professor1);

        System.out.println("\nAlunos");

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            
            System.out.print("\n- Digite o nome do aluno " + (i + 1) + ": ");
            aluno.setNome(input.nextLine());

            System.out.print("- Digite a matricula de " + aluno.getNome() + ": ");
            aluno.setMatricula(input.nextInt());

            double[] notas = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.print("- Digite a nota " + (j + 1) + " de " + aluno.getNome() + ": ");
                notas[j] = input.nextDouble();
            }
            
            input.nextLine();
            
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        
        curso1.setAlunos(alunos);
        
        System.out.println(curso1.obterInfo());

    }
}
