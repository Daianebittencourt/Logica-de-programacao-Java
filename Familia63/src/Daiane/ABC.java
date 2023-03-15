package Daiane;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o número B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o número C: ");
		c = leia.nextInt();
		
		
		if (a + b > c) {
			System.out.println("\nA SOMA DE A + B É MAIOR DO QUE C!");
		} else if (a + b < c) { 
			System.out.println("\nA SOMA DE A + B É MENOR DO QUE C!"); 
		} else { 
			System.out.println("\nA SOMA DE A + B É IGUAL A C!"); 
		}
		
		
	}

}
