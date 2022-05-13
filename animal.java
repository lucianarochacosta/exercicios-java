package Exercicios;

public class animal {
	
	private String nome;
	private int idade;
	
	public animal(String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom()
	{
		System.out.println("emitiu som");
	}
	
	public void correr()
	{
		System.out.println("correu!");
	}
	
	public void subirArvore()
	{
		System.out.println("subiu na árvore!");
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
	
}
