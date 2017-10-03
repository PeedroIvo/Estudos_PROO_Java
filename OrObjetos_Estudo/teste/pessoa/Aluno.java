package teste.pessoa;

import java.util.Arrays;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    private double[] notas;

    public Aluno() {
    }//Se não chamar o construtor da superclasse, por padrão o contrutor vazio da superclasse é chamado

    public Aluno(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }//Contrutor chamando construtor com atributos da superclasse
    
    public void metodoQualquer(){
        super.getNome(); //Para chamar um metodo ou atributo da superclasse, pode se usar o "super." antes
        this.getNome(); //Mas também pode-se usar o "this."
        this.teste = "teste";
        super.teste = "teste2";
    }
    
    @Override
    public String imprimirEndereco(){
        String s = "Endereço do Aluno: " + super.getEndereco();
        return s;
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calculaMedia(){
        return 0;
    }
    
    public boolean isAprovado(){
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + '}';
    }
    
}
