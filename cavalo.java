package Exercicios;

public class cavalo extends animal {
	
	public cavalo (String nome, int idade)
	{
		super(nome,idade);
	}
	
	public void imprimirInfo()
	{
		System.out.println("O cavalo "+getNome()+" tem "+getIdade()+" anos de idade.");
	}
}
