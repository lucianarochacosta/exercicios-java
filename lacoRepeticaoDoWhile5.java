/* 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados. */

package Exercicios;

import java.util.Scanner;

public class lacoRepeticaoDoWhile5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,  soma=0;
		do
		{
			System.out.println("Insira um número (ou digite zero para encerrar): ");
			num = leia.nextInt();
			soma += num;
		}while(num!=0);
		
		System.out.println("A soma dos números digitados é "+soma+".");
	}

}
