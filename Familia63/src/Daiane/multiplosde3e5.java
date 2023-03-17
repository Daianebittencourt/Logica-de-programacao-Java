package Daiane;

import java.util.Scanner;

public class multiplosde3e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n1, n2;

		Scanner leia = new Scanner(System.in);
		
		
			
			System.out.println("\nEntre com o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nEntre com o segundo número: ");
			n2 = leia.nextInt();
			
			if (n1>=n2) {
				System.out.println("\nIntervalo Inválido!");
			}
			
			System.out.println("\nNúmero multiplos de 3 e 5 no intervalo: "+n1+  ", "+n2);
			
			for (i = n1; i <=n2;i++) { // o laço de repetição pode ficar em qualquer lugar do código?
			if  (i % 3 ==0 && i % 5 ==0) {
	System.out.println(i+ " Esse número é divisível por 3 e por 5");
			}
			
	
				
			}
		}

	}


