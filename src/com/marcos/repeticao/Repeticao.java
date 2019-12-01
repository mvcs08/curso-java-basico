package com.marcos.repeticao;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {

		//int i = 1;
		//int max = 10;
		
		/* While -> enquanto a condição for verdadeira, executará
		 as intruções dentro do bloco. */
		
		/*
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		/* Diferença entre while para do...while */
		/* Mesmo que a condição seja falsa
		 * ela será executada ao menos uma vez no do...while
		 
		
		do {
			System.out.println("Valor de i: " + i);
			i++;
		
		}while(i <= max);
		
		for( i=0; i<=max; i++) {
			System.out.println(i);
		}
	*/
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int max = sc.nextInt();
		int cont = 0;
		
		for(; i<=max; i++) {
			if(i % 2 == 0) {
				System.out.println("Valor de i: "+ i);
				cont++;
				break;
			}
		}
		System.out.println("Qtd, números divisíveis por 2: "+ cont);
	}

}
