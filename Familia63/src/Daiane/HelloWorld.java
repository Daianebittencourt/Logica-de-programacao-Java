package Daiane;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Daiane"; // entrada de dados (variáveis declaradas e com os valores)
		int idade = 22;
		double altura = 1.59, nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nO seu nome é:"+nome); //para saída de dados
		System.out.println("\nA sua idade é:"+idade); 
		System.out.println("\nA sua altura é:"+altura);
		
		System.out.println("\nEntre com a primeira nota:");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota:");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota:");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.printf("\nMédia do semestre: %.2f",media);
		
		
		
		
	}

}
