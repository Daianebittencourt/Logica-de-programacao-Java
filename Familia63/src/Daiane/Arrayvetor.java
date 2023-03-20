package Daiane;

import java.util.Scanner;

public class Arrayvetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array simples
		float[] media = new float[3]; // [] criando uma variavel com uma dimensão [] [] bi [][][] tri dimensional | new instanciando 
		// [3] - tamanho | a posição, teremos 3 para armazenar
		float n1,n2,n3,somaMedia=0, mediaGeral;
		int x; //variavel para o looping
		
		Scanner leia =new Scanner(System.in);
		// começa a contar de 0, então 3 posições ficam assim: 0,1,2 [3].
		
		for(x=0; x<3; x++) { // 0 pq começa pelo 0 as posições do vetor
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media [x] = (n1+n2+n3)/3;
			System.out.println("\nSua média foi de: "+media[x]);
			somaMedia += media[x];
			if (media [x])
			
		}
	}

}
