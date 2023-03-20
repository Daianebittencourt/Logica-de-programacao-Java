package Daiane;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[][] numeros = new int[3][3];
		int linha, coluna, somaMatriz = 0, somaDiagonal = 0;

		// estamos utilizando o for pq já tem intervalo definido 3 linhas e 3 colunas

		for (linha = 0; linha < 3; linha++) { // encadeado por ser bidimensional
			for (coluna = 0; coluna < 3; coluna++) {// um dentro do outro
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				somaMatriz += numeros[linha][coluna];

				if (linha == coluna) { // linha e coluna iguais = diagonal principal
					somaDiagonal += numeros[linha][coluna];
					
				}
			}

		}
		System.out.println("\nSoma dos valores da Array do tipo Matriz: " + somaMatriz);
		System.out.println("\nSoma dos valores da diagonal principal: " + somaDiagonal);

	}
}