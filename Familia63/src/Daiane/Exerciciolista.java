package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerciciolista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);

		int op = -1;

		while (op != 0) {

			System.out
					.println("**************************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("\n\t\t\t               FILA DE ESPERA");
			System.out.println("                                                                         ");
			System.out.println("                                                                         ");
			System.out
					.println("**************************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("\n\t\t\t1 - Adicionar cliente na fila");
			System.out.println("\n\t\t\t2 - Listar todos os clientes da lista de espera");
			System.out.println("\n\t\t\t3 - Chamar (retirar) uma pessoa da fila");
			System.out.println("\n\t\t\t0 - Sair");
			System.out.println("                                                                         ");
			System.out.println("                                                                         ");
			System.out
					.println("**************************************************************************************");
			System.out
					.println("**************************************************************************************");
			System.out.println("\nEntre com a opção desejada:");
			System.out.println("                                                                         ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do cliente para adicionar na fila de espera:");
				String nomeCliente = leia.next();
				fila.add(nomeCliente);
				System.out.println("\nCliente adicionado com sucesso!");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\nClientes na fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					String clienteChamado = fila.remove();
					System.out.println("Cliente " + clienteChamado + " chamado com sucesso!");
				}
				break;
			case 4:

				System.out.println("\\nAgradecemos a utilização!");
				break;

			default:
				System.out.println("\n\t\t\tOpção Inválida!\n");

			}
		}
	}
}
