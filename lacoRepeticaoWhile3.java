/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. */

package Exercicios;

import java.util.Scanner;

public class lacoRepeticaoWhile3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int id=0, total21=-1, total50=0;
		while(id!=-99)
		{
			System.out.println("Insira a idade (ou digite -99 para finalizar): ");
			id = leia.nextInt();
			if(id<=21)
			{
				total21++;
			} else if(id>=50)
				{
				total50++;
				}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+total21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+total50);

	}

}
