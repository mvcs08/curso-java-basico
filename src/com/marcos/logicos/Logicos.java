package com.marcos.logicos;

public class Logicos {

	public static void main(String[] args) {
		boolean falso = false;
		boolean verdadeiro = true;
		
		System.out.println("falso AND verdadeiro " + (falso & verdadeiro));
		System.out.println("falso OR verdadeiro " + (falso | verdadeiro));
		System.out.println("falso AND verdadeiro " + (falso && verdadeiro));
		System.out.println("falso OR verdadeiro "+ (falso || verdadeiro));
		System.out.println("falso XOR verdadeiro "+ (falso ^ verdadeiro));
		System.out.println("negando falso " + !falso);
		System.out.println("negando verdadeiro "+ !verdadeiro);
		
	}

}
