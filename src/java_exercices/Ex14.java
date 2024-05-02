//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

package java_exercices;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro numero: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite o valor do segundo numero: ");
		int num2 = scanner.nextInt();
		if (num1 > num2) {
			System.out.print("Numero " + num1 + " é maior que " + num2);
		} else {
			System.out.print("Numero " + num1 + " é menor que " + num2);
		}

	}

}
