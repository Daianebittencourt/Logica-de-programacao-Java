package Daiane;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int numero,contnum = 0,multiplos = 0;
		float media;
		
		
		do {
			System.out.println("\nEntre com os números");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero !=0) {
				multiplos += numero;
				contnum++;
				System.out.println(contnum);
				
			
			} 
			
		} while (numero !=0);
		media = multiplos /contnum;
System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f",media);

	}

}
