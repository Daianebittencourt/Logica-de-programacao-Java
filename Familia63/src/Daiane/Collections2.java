package Collections;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		System.out.println("\nDigite a quatidade de números que vai adicionar na sua lista: ");
		int tamanho = leia.nextInt();
		
		for(int i=0;i<tamanho;i++) {
	
		System.out.println("\nDigite o "+ (i+1) + "º número da lista, não repita os números: ");
		Integer elemento = leia.nextInt();
		numeros.add(elemento);
		}
		
		System.out.println("\n\t\t\tOs números da lista são: "+numeros);
		
		Collections.sort(numeros); // já coloquei sort e o LinkedHashSet, mas não funciona.
		System.out.println("\n\t\t\tOs números por ordem crescente: "+numeros);

	

	}
}



