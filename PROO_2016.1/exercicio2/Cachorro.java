package exercicio2;

public class Cachorro {

    private String nome;
    private int idade;
    private double peso_kg;
    private double tamanho_m;

    public Cachorro() {
    }

    public Cachorro(String nome, int anoAtual, int anoNascimento) {
        this.nome = nome;
        this.idade = this.calcularIdade(anoAtual, anoNascimento);
        this.boasVindas();
    }

    //Método "latir" levemente alterado, para que qualquer cachorro se encaixe em uma condição!
    public void latir() {
        if (this.tamanho_m > 0.6 && this.idade > 5) {
            System.out.println("Ruuuh, Ruuuh!");
        } else if (this.tamanho_m > 0.6 && this.idade <= 5) {
            System.out.println("Ruh, Ruh!");
        } else if (this.tamanho_m <= 0.6 && this.idade > 5) {
            System.out.println("Auuu, Auuu!");
        } else if (this.tamanho_m <= 0.6 && this.idade <= 5) {
            System.out.println("Au, Au!");
        }
    }

    //Método "pular" levemente alterado, para que qualquer cachorro se encaixe em uma condição!
    public void pular() {
        if (this.peso_kg <= 7 && this.tamanho_m > 0.5) {
            System.out.println("Pulo alto!");
        } else if (this.peso_kg > 7 && this.tamanho_m < 0.5) {
            System.out.println("Pulo baixo!");
        } else {
            System.out.println("Pulo médio!");
        }
    }

    public int calcularIdade(int anoAtual, int anoNascimento) {
        int idade = anoAtual - anoNascimento;
        return idade;
    }

    public void classificarIdade() {
        if (this.idade <= 6) {
            System.out.println("Cão jovem");
        } else if (this.idade > 12) {
            System.out.println("Cão velho");
        } else {
            System.out.println("Cão adulto");
        }
    }

    public void boasVindas() {
        System.out.println("Olá " + this.nome + ", seja bem vindo!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(double peso_kg) {
        this.peso_kg = peso_kg;
    }

    public double getTamanho_m() {
        return tamanho_m;
    }

    public void setTamanho_m(double tamanho_m) {
        this.tamanho_m = tamanho_m;
    }

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Zezinho", 2016, 2012);

        cachorro.setPeso_kg(6);
        cachorro.setTamanho_m(0.6);

        cachorro.latir();
        cachorro.pular();
        cachorro.classificarIdade();

    }
}
