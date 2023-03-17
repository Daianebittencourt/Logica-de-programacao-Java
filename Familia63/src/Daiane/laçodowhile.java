package Daiane;

import java.util.Scanner;

public class laçodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabuada, x = 1, resultado;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite a tabuada que deseja visualizar:");
		tabuada = leia.nextInt();

		do { // faça
			resultado = tabuada * x;
			System.out.println("\n" + tabuada + "X" + x + "=" + resultado);
			x++;

		} while (x <= 10); // enquanto 

	}
}
// tem um numero definido pra rodar FOR | não tem um numero definido while (testa e depois executa)ou do while (executa e depois testa)