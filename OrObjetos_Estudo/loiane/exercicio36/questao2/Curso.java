package loiane.exercicio36.questao2;

public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public String obterInfo(){
        String info = "\nCurso" +
                      "\n- Nome: " + this.nome +
                      "\n- Horário:" + this.horario + "\n";
        
        if(this.professor != null){
            info += this.professor.obterInfo();
        }
        
        if(this.alunos != null){
            info += "\nAlunos\n";
            for(Aluno aluno : this.alunos){
                info += aluno.obterInfo();
            }
        }
        
        return info;
    }
}
