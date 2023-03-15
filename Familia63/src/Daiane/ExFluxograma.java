package Daiane;

import java.util.Scanner;

public class ExFluxograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float salario,abono,novosalario;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com o valor do seu salário: ");
salario = leia.nextFloat();
System.out.println("\nEntre com o valor do seu abono salarial: ");
abono = leia.nextFloat();

novosalario = (salario+abono);

System.out.printf("\nO seu novo salário: %.2f",novosalario);

		
	}

}
