/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
      10-14 infantil
      15-17 juvenil
      18-25 adulto */

package Exercicios;

import java.util.Scanner;

public class exercicio3LacoDecisao {

	public static void main(String[] args) {
		int id;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira a sua idade: ");
		id = leia.nextInt();
		
		if(id>=10 && id<=14)
		{
			System.out.println("\nCategoria infantil!");
		}
			else if(id>=15 && id<=17)
			{
			System.out.println("\nCategoria juvenil!");
			}
			else if(id>=18 && id<=25)
			{
			System.out.println("\nCategoria adulto!");
			}
			else
			{
			System.out.println("\nNenhuma categoria aplicável.");
			}
	}

}
