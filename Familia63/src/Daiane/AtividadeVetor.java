package Daiane;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vet = new int [5];
		int maiorPontuacao=0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<5;x++) {
			System.out.println("\nEntre com um valor: ");
			vet [x] = leia.nextInt();
			
			if(maiorPontuacao < vet[x]) {
				maiorPontuacao = vet[x];
				
				
			}
		}
		System.out.println("\nO maior valor é: "+maiorPontuacao);

	}

}
