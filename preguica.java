package Exercicios;

public class preguica extends animal {
	
	public preguica (String nome, int idade)
	{
		super(nome,idade);
	}
	
	public void imprimirInfo()
	{
		System.out.println("A preguiça "+getNome()+" tem "+getIdade()+" anos de idade.");
	}
}
