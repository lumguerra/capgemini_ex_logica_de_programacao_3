//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
//sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
//Recuperação (media entre 5.1 a 6.9);

package java_exercices;

import java.util.Scanner;

public class Ex16 {

	static float calcularMedia(float nota1, float nota2, float nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a nota 1: ");
		float nota1 = scanner.nextFloat();
		System.out.println("Digite a nota 2: ");
		float nota2 = scanner.nextFloat();
		System.out.println("Digite a nota 3: ");
		float nota3 = scanner.nextFloat();
		float media = calcularMedia(nota1, nota2, nota3);
		if (media >= 7) {
			System.out.println(nome + " foi aprovado.");
		} else if (media <= 5) {
			System.out.println(nome + " foi reprovado.");
		} else if (media > 5 && media < 7) {
			System.out.println(nome + " está de recuperação.");
		}

	}

}
