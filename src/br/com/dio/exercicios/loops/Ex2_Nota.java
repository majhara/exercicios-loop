package br.com.dio.exercicios.loops;

/*
Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido
e continue pedindo at� que o usu�rio informe um valor v�lido.
*/

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Digite a nota: ");
		nota = sc.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.print("Valor inv�lido. Digite uma valor entre 0 e 10: ");
			nota = sc.nextInt();
		}
		sc.close();
	}
}
