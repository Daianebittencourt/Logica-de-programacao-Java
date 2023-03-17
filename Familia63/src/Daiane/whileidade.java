package Daiane;

import java.util.Scanner;

public class whileidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, cont21=0,cont50=0;
		Scanner leia = new Scanner(System.in);
		
	
		
		System.out.println("\nEntre com as idades: ");
		idade = leia.nextInt();
		
		while (idade >=0) { //situação em que deve rodar 
			if (idade < 21) {
				cont21++;
				
			}
			else if (idade > 50) {
				cont50++;
			
				
			}
			System.out.println("\nEntre com as idades: ");
			idade = leia.nextInt();	
		
		}
			
		System.out.println("\nA quantidade de pessoas menores que 21 é: "+cont21);
		System.out.println("\nA quantidade de pessoas maiores que 50 é: "+cont50);

	}

}
