package Daiane;

import java.util.Scanner;

public class ExDiferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float n1,n2,n3,n4,dif;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com o primeiro número: ");
n1 = leia.nextFloat();
System.out.println("\nEntre com o segundo número: ");
n2 = leia.nextFloat();
System.out.println("\nEntre com o terceiro número: ");
n3 = leia.nextFloat();
System.out.println("\nEntre com o quarto número: ");
n4 = leia.nextFloat();

dif = (n1*n2) - (n3*n4);

System.out.printf("\nA diferença é: %.2f",dif);



	}

}
