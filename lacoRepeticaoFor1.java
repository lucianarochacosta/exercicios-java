package Exercicios;

public class lacoRepeticaoFor1 {

	public static void main(String[] args) {
		float num;
		System.out.println("\nNúmeros de 1000 a 1999 que quando divididos por 11 obtemos resto 5:");
		for(num=1000;num<2000;num++)
		{
			if(num%11==5)
			{
				System.out.printf("\n %.0f",num);
			}
		}

	}

}
