package loiane.exercicio28a33.questao3;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private final String[] disciplinas = new String[3];
    private final double[] notas = new double[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina(int numDiciplina) {
        return this.disciplinas[numDiciplina-1];
    }

    public void setDisciplinas(String disciplina1, String disciplina2, String disciplina3) {
        this.disciplinas[0] = disciplina1;
        this.disciplinas[1] = disciplina2;
        this.disciplinas[2] = disciplina3;
    }

    public double getNota(int numDiciplina) {
        return this.notas[numDiciplina-1];
    }

    public void setNotas(double nota1, double nota2, double nota3) {
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    public void verificarAprovacao(String disciplina) {
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (disciplina.equals(this.disciplinas[i])) {
                System.out.println(this.nome + " foi " + (this.notas[i] >= 7 ? "APROVADO" : "REPROVADO") + " em " + this.disciplinas[i] + "!\n");
                break;
            } else if (this.disciplinas.length - 1 == i) {
                System.out.println(this.nome + " não cursa a disciplina " + disciplina + "!\n");
            }
        }
    }
    
    public void imprimeHistorico(){
        System.out.println("Histórico: " + this.notas[0] + " | " + this.disciplinas[0]);
        System.out.println("           " + this.notas[1] + " | " + this.disciplinas[1]);
        System.out.println("           " + this.notas[2] + " | " + this.disciplinas[2] + "\n");
    }

}
