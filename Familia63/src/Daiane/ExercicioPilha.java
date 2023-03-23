package Collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();

		Scanner leia = new Scanner(System.in);

		int op = -1;

		while (op != 0) {

			System.out
					.println("**************************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("\n\t\t\t               PILHA DE LIVROS");
			System.out.println("                                                                         ");
			System.out.println("                                                                         ");
			System.out
					.println("**************************************************************************************");
			System.out.println("                                                                         ");
			System.out.println("\n\t\t\t1 - Adicionar um novo livro na pilha");
			System.out.println("\n\t\t\t2 - Listar todos os livros da pilha");
			System.out.println("\n\t\t\t3 - Retirar o último livro da pilha");
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
				System.out.println("\nDigite o nome do livro para adicionar na pilha:");
				String nomeLivro = leia.next();
				pilha.push(nomeLivro);
				System.out.println("\nLivro adicionado com sucesso!");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					System.out.println("\nLivros na pilha:");
					for (String livros : pilha) {
						System.out.println(livros);
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					String livroRetirado = pilha.pop();
					System.out.println("Livro " + livroRetirado + " retirado com sucesso!");
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
