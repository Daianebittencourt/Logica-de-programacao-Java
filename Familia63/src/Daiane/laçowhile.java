package Daiane;

import java.util.Scanner;

public class laçowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// diferença do for para while - wwhile só tem uma condição, condição final para sair
		
		int numero,somapar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		
		while (numero != 0) { // != significa diferente
			if(numero % 2 ==0) {
				somapar += numero; //somapar = somapar + numero
		
			}else {
				contimpar++; //vai fazer a contagem 
			}
			System.out.println("\nEntre com um número: "); // precisamos dessa Sysout para sair do looping 
			numero = leia.nextInt();
		}
		
		System.out.println("\nO somatório dos números pares foi de: "+somapar);
		System.out.println("\nA quantidade de números impares foi de: "+contimpar);
		
	}

}
