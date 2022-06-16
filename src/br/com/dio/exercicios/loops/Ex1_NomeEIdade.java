package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Fa�a um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		while (true) {

			System.out.print("Digite o nome: ");
			nome = sc.next();

			if (nome.equals("0")) break;

			System.out.print("Digite a idade: ");
			idade = sc.nextInt();
			System.out.println("Sistema parado. Nome inv�lido!");
		}
		sc.close();
	}
}
