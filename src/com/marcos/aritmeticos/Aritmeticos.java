package com.marcos.aritmeticos;

public class Aritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		//Subtração
		resultado = resultado - 1;
		System.out.println(resultado);
		//Multiplicação
		resultado = resultado * 2;
		System.out.println(resultado);
		//Divisão
		resultado = resultado / 2;
		System.out.println(resultado);
		//Soma
		resultado = resultado + 8;
		System.out.println(resultado);
		//Módulo
		resultado = resultado % 7;
		System.out.println(resultado);
	
		//Imprime e depois soma
		//4
		System.out.println(resultado++);
		
		//Soma depois imprime
		System.out.println(++resultado);
		
		
	}

}
