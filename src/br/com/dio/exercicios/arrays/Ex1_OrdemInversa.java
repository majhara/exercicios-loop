package br.com.dio.exercicios.arrays;

/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		
		int [] vetor = {57, 12, 96, 37, -48, 05};
		
		System.out.print("Vetor original: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		System.out.print("\nVetor invertido: ");
		for (int i = (vetor.length - 1); i >= 0 ; i--) {
			System.out.print(vetor[i] + " ");
		}
	}
}
