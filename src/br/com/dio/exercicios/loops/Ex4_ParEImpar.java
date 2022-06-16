package br.com.dio.exercicios.loops;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int quantNumeros;
		int quantPares = 0, quantImpares = 0;
		
		System.out.print("Digite o n�mero: ");
		quantNumeros = sc.nextInt();
			
		for (int i = 0; i < quantNumeros; i++) {
			
			System.out.print("N�mero: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			 else quantImpares++;
			
		}
		
		System.out.println("Quantidades de Pares: " + quantPares);
		System.out.println("Quantidades de Impares: " + quantImpares);
	
		sc.close();
	}
}
