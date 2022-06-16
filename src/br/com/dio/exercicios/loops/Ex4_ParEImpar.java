package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int quantNumeros;
		int quantPares = 0, quantImpares = 0;
		
		System.out.print("Digite o número: ");
		quantNumeros = sc.nextInt();
			
		for (int i = 0; i < quantNumeros; i++) {
			
			System.out.print("Número: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			 else quantImpares++;
			
		}
		
		System.out.println("Quantidades de Pares: " + quantPares);
		System.out.println("Quantidades de Impares: " + quantImpares);
	
		sc.close();
	}
}
