package Exercicios;

public class cachorro extends animal {

	public cachorro (String nome, int idade)
	{
		super(nome,idade);
	}
	
	public void imprimirInfo()
	{
		System.out.println("O cachorro "+getNome()+" tem "+getIdade()+" anos de idade.");
	}
}
