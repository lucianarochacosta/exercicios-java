//2-Faça um programa que entre com três números e coloque em ordem crescente.

package Exercicios;

import java.util.Scanner;

public class exercicio2LacoDecisao {

	public static void main(String[] args) {

		int a, b, c;
		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextInt(); 
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextInt(); 
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextInt(); 

		if (a <= b && b <= c) {  
			System.out.println("\nOrdem crescente: " + a + ", " + b + " e " + c);
		} 
			else if (a <= c && c <= b) {
			System.out.println("\nOrdem crescente: " + a + ", " + c + " e " + b);
		} 
			else if (b <= a && a <= c) {
			System.out.println("\nOrdem crescente: " + b + ", " + a + " e " + c);
		} 
			else if (b <= c && c <= a) {
			System.out.println("\nOrdem crescente: " + b + ", " + c + " e " + a);
		} 
			else if (c <= a && a <= b) {
			System.out.println("\nOrdem crescente: " + c + ", " + a + " e " + b);
		} 
			else if (c <= b && b <= a) {
			System.out.println("\nOrdem crescente: " + c + ", " + b + " e " + a);
		}
			else {
				System.out.println("\nOPÇÃO INVALIDA");
			}

	}

}
