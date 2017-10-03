package loiane.exercicio36.questao1;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void imprimeAgenda() {
        System.out.println("\nAgenda " + this.nome);
        if (this.getContatos() != null) {
            for (Contato contato : this.getContatos()) {
                System.out.println("\nNome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getTelefone());
                System.out.println("Email: " + contato.getEmail());
            }
        }
    }
}
