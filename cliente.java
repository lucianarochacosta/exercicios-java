/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes
a esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */

package Exercicios;

public class cliente {
	private String nomeCompleto;
	private String email;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private int cpf;
	private int idade;
	
	public cliente (String nomeCompleto, String email, int diaNascimento, int mesNascimento, int anoNascimento, int cpf, int idade)
	{
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nCliente: "+nomeCompleto);
		System.out.println("\nData de nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
		System.out.println("\nIdade: "+idade);
		System.out.println("\nCPF: "+cpf);
		System.out.println("\nEmail: "+email);
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
