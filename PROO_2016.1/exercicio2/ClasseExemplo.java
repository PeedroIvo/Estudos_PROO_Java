package exercicio2;

/*
Classes são como receitas, contém toda a informação própria dos Objetos, apresentam características e
comportamentos,representados pelos atributos e métodos respectivamente.

Atributos representam as características do objeto, cada atributo é representado dentro da classe por
variáveis, podendo ser de varios tipos como inteiro, double e String.

Métodos representam as ações que o objeto pode exercer, quando for solicitado, podem apenas se comunicar
ou tbm podem interagir com outros objetos. Alguns métodos podem depender de alguns atributos (variáveis),
que são passados na hora da solicitação, para serem executados.
*/

public class ClasseExemplo {

	//Atributos
	public String nome;
	public int idade;
	public String profissao;
	public double salario;

	//Métodos
	public void cumprimentar() {
            System.out.println("Oi! Meu nome é " + this.nome + ", tudo bem?");
	}

	public void mostraAtributos() {
            System.out.println("Nome: " + this.nome
                    + "Idade: " + this.idade
                    + "Profissão: " + this.profissao
                    + "Salário: " + this.salario);
	}

}
