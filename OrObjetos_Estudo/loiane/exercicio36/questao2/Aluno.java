package loiane.exercicio36.questao2;

public class Aluno {

    private String nome;
    private int matricula;
    private double[] notas;

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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {
        String info = "\n- Nome: " + this.nome
                    + "\n- Matrícula: " + this.matricula
                    + "\n- Notas: ";
        
        double totalNotas = 0;
        for (double nota : this.notas) {
            info += nota + " ";
            totalNotas += nota;
        }
        
        if(totalNotas/this.notas.length >= 7){
            info += "\n- APROVADO!\n";
        } else {
            info += "\n- REPROVADO!\n";
        }
        
        return info;
    }
}
