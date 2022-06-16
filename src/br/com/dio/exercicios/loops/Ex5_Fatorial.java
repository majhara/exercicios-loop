package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex5_Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial;
		int multiplicacao = 1;
		
		System.out.print("Digite o n�mero: ");
		fatorial = sc.nextInt();
		
		System.out.print(fatorial + "! = ");
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao *= i;	
		}
		System.out.print(multiplicacao);
		
		sc.close();
	}
}
