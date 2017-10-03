package teste.pessoa;

public abstract class Pessoa implements TesteConstantes {
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    protected String teste;

    public Pessoa() {
    }//Construtor vazio da Superclasse

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }//Construtor da Superclasse com os atributos
    
    public String imprimirEndereco(){
        String s = "Endereço: " + this.getEndereco();
        return s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
