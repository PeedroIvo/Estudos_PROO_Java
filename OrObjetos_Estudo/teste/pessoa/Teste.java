package teste.pessoa;

public class Teste {
    
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        //Assim tem-se acesso aos private de "Aluno.java" e "Professor.java" e somente aos public de "Pessoa.java"
        
        Pessoa aluno2 = new Aluno();
        Pessoa professor2 = new Professor();
        //Assim tem-se acesso somente aos public de "Pessoa.java", "Aluno.java" e "Professor.java"

        aluno2.teste = "testealuno2";
        System.out.println(aluno2.teste);
        
        aluno2.setEndereco("Rua 1, Num 1");
        professor1.setEndereco("Rua 2, Num 2");
        
        System.out.println(aluno2.imprimirEndereco());
        System.out.println(professor1.imprimirEndereco());
        
        System.out.println(TesteConstantes.FACEBOOK);
        System.out.println(TesteConstantes.TWITTER);
        
        System.out.println("\n" + aluno2);
    }
    
}
