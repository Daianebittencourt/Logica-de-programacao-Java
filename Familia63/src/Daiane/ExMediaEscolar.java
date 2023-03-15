package Daiane;

import java.util.Scanner;

public class ExMediaEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media, nota1, nota2, nota3, nota4;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota");
		nota3 = leia.nextFloat();
		System.out.println("\nEntre com a quarta nota: ");
		nota4 = leia.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("\nSua média semestral é: %.2f", media);

	}

}
