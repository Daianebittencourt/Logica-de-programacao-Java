package Daiane;

import java.util.Scanner;

public class lanchoneteswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op,x1=10, x2=15,x3=18,x4=12,x5=8,x6=13,quantidade,preco,vtotal;
		
		 Scanner leia = new Scanner(System.in);
		 
		 
		 	System.out.println("\n\t\tCARDÁPIO");
			System.out.println("\n1- Cachorro quente | Preço: "+x1);
			System.out.println("\n2- X-Salada | Preço: "+x2);
			System.out.println("\n3- X-Bacon | Preço: "+x3);
			System.out.println("\n4- Bauru | Preço: "+x4);
			System.out.println("\n5- Refrigerante | Preço: "+x5);
			System.out.println("\n6- Suco de laranja | Preço: "+x6);
			System.out.println("\nDigite o numero do item que deseja comprar: ");
			op = leia.nextInt();
			
		
			switch(op) {
			
			case 1:
				System.out.println("\n1- Cachorro quente | Preço: "+x1);
				break;
			case 2:
				System.out.println("\n2- X-Salada | Preço: "+x2);
				break;
			case 3: 
				System.out.println("\n3- X-Bacon | Preço: "+x3);
				break;
			case 4:
				System.out.println("\n4- Bauru | Preço: "+x4);
				break;
			case 5:
				System.out.println("\n5- Refrigerante | Preço: "+x5);
				break;
			case 6:
				System.out.println("\n6- Suco de laranja | Preço: "+x6);
				break;
				
				
				
			default:
				System.out.println("\nOpção inválida!!!");
		
		
	}
			System.out.println("\nDigite quantas unidades você deseja comprar: ");
			quantidade = leia.nextInt();	
			
			preco = op ;
			vtotal = quantidade * preco;
			
			System.out.println("\nValor total e: | o Produto comprado foi: "+vtotal);
			
			
			
			
			
	}
}

