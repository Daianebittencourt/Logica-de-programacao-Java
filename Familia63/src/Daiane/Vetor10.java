package Daiane;

import java.util.Scanner;

public class Vetor10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetorNumeros = {7,4,1,8,5,2,9,6,3,10};
		int i,busca, posicao,cont=0;
		
		System.out.println("\nDigite um número de 1 a 10 para encontrar em qual caixa ele está escondido: ");
		busca = leia.nextInt();
		
		for (i=0;i<10;i++) {
			
			if (vetorNumeros[i] == busca) {
				posicao = i;
				System.out.println("\nO número digitado está na caixa: "+posicao);	
				cont++;
				
			}
			
	}
		if(cont == 0) {
			System.out.println("\nNão foi encontrado");
}
}
}
