package Daiane;

import java.util.Scanner;

public class atividadevetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] dado = new int [10];
		int somaLancamento=0,quantMaior=0,x;
		float mediaLancamento;
		
		Scanner leia =new Scanner(System.in);
		
		for (x=0,x<10,x++) {
			System.out.println("\nEntre com o número do lançamento:");
			dado[x] = leia.nextInt();
			
			somaLancamento += dado[x];
			
			if (dado[x] ==6) {
				quantMaior++;
				
			}
		}
		
		mediaLancamento = somaLancamento/10;
		System.out.println("\nQuantidade de vezes que saiu o maior valor: "+quantMaior);
		System.out.println("\nMédia de lançamento: "+mediaLancamento);
		
	}

}
