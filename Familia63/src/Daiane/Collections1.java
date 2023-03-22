package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		List<String> minhaLista = new ArrayList();
		
		System.out.println("\nDigite a quatidades de cores que vai adicionar na sua lista: ");
		int tamanho = leia.nextInt();
		
		for(int i=0;i<tamanho;i++) {
	
		System.out.println("\nDigite o nome da "+ (i+1) + "ª cor da lista: ");
		String elemento = leia.next();
		minhaLista.add(elemento);
		}
		
		System.out.println("\n\t\t\tAs cores da lista são: "+minhaLista);
		
		Collections.sort(minhaLista);
		System.out.println("\n\t\t\tA lista de cores ordenadas por ordem crescente: "+minhaLista);
		

	

	}
}




