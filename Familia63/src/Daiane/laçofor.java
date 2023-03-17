package Daiane;

import java.util.Scanner; //

public class laçofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for, while e do while
		
		float n1,n2,n3,media, somamedia=0,mediageral;
		//atribuiu o valor a somamedia pq ele não tem nenhum valor antes da primeira soma | o 0 é neutro e não vai interferir
		int x; //variável de looping
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=3;x++) { // tem 3 parametros, condições, que são utilizadas dentro do parenteses | x++ é x+1 usado no laço de repetição.
	// inicio do laço (1°vou começar com tanto, 2º fim do laço (quandas vezes eu quero que rode), (3º vai fazer o laço de repetição).
			// x-- diminui / x=x+2 pula de dois em dois.
			
			System.out.println("\nEntre com o nome do alune: ");
			nome = leia.nextLine();
			leia.nextLine(); // bug da IDE, só acontece com variavel String e caracter
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			somamedia += media; // só para não repetir a variável | somamedia = somamedia + media;
			
			// sysout ctrl + espaço
			System.out.println("\nA média do alune "+nome+" foi de: "+media);
			
		}
		
		mediageral = somamedia /3;
		
		System.out.printf("\nMédia geral da turma: %.2f",mediageral);
		
		
		
	}

}
