package Daiane;

import java.util.Scanner;

public class laçoif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, media;
		int op;

		Scanner leia = new Scanner(System.in); // instanciar

		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();

		media = (n1 + n2 + n3) / 3;

		System.out.printf("\nMédia das notas: %.2f", media);

		// if seria o SE

		if (media >= 7 && media <= 10) {// && operador lógico E e || OU
			System.out.println("\nAlune Aprovade!");
		} else if (media >= 5 && media < 7) { // utiliza para colocar as opções
			System.out.println("\nAlune de exame!"); // else if seria o SENÃO
		} else { // termina com else

			System.out.println("\nAlune de reprovade!");

			System.out.println("\n\t\tMenu de elogios"); // \t espaço de TAB
			System.out.println("\n1- Feliz");
			System.out.println("\n2- Acolhedora");

			
			
			
			
			
	System.out.println("\n3- Está de parabéns");
			System.out.println("\n4- Nota 10");
			System.out.println("\n5- Familia é show");
			System.out.println("\nDigite a sua opção:");
			op = leia.nextInt();

			switch (op) { // significa escolha
			case 1:
				System.out.println("\n1- Feliz");
				break;
			case 2:
				System.out.println("\n2- Acolhedora");
				break;
			case 3:
				System.out.println("\n3- Está de parabéns");
				break;
			case 4:
				System.out.println("\n4- Nota 10");
				break;
			case 5:
				System.out.println("\n5- Familia é show");
				break;
			default:
				System.out.println("\nOpção inválida!:");
			}
		}
	

}
}
