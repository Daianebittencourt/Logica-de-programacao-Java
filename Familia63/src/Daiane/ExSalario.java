package Daiane;

import java.util.Scanner;

public class ExSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sbruto, sliquido, addnoturno, horasextras, descontos;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o seu salário bruto: ");
		sbruto = leia.nextDouble();
		System.out.println("\nDigite o seu adicional noturno: ");
		addnoturno = leia.nextDouble();
		System.out.println("\nDigite o valor das horas extras: ");
		horasextras = leia.nextDouble();
		System.out.println("\nDigite o valor dos descontos: ");
		descontos = leia.nextDouble();

		sliquido = (sbruto + addnoturno + horasextras - descontos);

		System.out.printf("\nSeu salário líquido esse mês é: %.2f", sliquido);

	}

}
