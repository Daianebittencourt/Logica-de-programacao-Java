package Daiane;

import java.util.Scanner;

public class EntregaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] minhaMatriz = new int [3][3];
		int linha=0, coluna=0, digP,digS,somaP=0,somaS=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		for (linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				minhaMatriz [linha][coluna] = leia.nextInt();
			}
		
		}
		if (linha == coluna) {
			somaP += minhaMatriz [linha] [coluna];
			System.out.println("\nA soma da matriz principal é"+somaP);
		
		
	
			if (linha == coluna) {
			somaS += minhaMatriz [linha] [3-1-linha];
			System.out.println("\nA soma da matriz segundária é"+somaS);
		}
		}
	}
		}
	

		
	

	



