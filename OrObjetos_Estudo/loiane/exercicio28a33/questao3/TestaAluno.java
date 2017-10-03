package loiane.exercicio28a33.questao3;

public class TestaAluno {
    
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno();
        
        aluno1.setMatricula(2990);
        aluno1.setNome("Pedro Ivo");
        aluno1.setCurso("Sistemas de Informação");
        aluno1.setDisciplinas("Filosofia", "Quimica", "Geografia");
        aluno1.setNotas(3.5, 7, 9.9);
        
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Curso: " + aluno1.getCurso() + "\n");
        
        aluno1.imprimeHistorico();
        
        aluno1.verificarAprovacao(aluno1.getDisciplina(1));
        aluno1.verificarAprovacao("Quimica");
        aluno1.verificarAprovacao(aluno1.getDisciplina(3));
        aluno1.verificarAprovacao("Portugues");
        
    }
    
}
