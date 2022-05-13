package Exercicios;

public class testeAnimal {

	public static void main(String[] args) {
		
		cachorro cachorro = new cachorro("Freddie", 7);
		
		cavalo cavalo = new cavalo("Alazão", 3);
		
		preguica preguica = new preguica("Fofa", 2);
		
		cachorro.imprimirInfo();
		System.out.print(" Ele ");
		cachorro.emitirSom();
		System.out.print(" e ");
		cachorro.correr();
		System.out.print("\n");
		cavalo.imprimirInfo();
		System.out.print(" Ele ");
		cavalo.emitirSom();
		System.out.print(" e ");
		cavalo.correr();
		System.out.print("\n");
		preguica.imprimirInfo();
		System.out.print(" Ela ");
		preguica.emitirSom();
		System.out.print(" e ");
		preguica.subirArvore();
		System.out.print("\n");
	}

}


