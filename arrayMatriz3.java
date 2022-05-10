//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package Exercicios;

import java.util.Scanner;

public class arrayMatriz3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		System.out.println("\nMATRIZ [3][3]\n");
		int cont = 0;
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("Digite um número para a posição "+"["+(l+1)+ "]" +" ["+(c+1)+"]:");
				matriz[l][c] = leia.nextInt();
				if(matriz[l][c] > 10)
				{
					cont++;
				}
			}
		}
		System.out.println("A matriz inserida possui "+cont+" valores maiores do que 10!");	
	}
}
