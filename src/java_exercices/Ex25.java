//Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
//imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
//maior, e uma mensagem que são diferentes;

package java_exercices;

import java.util.Scanner;

public class Ex25 {

	static void printMaior(int num1, int num2) {

		System.out.println("Numeros diferentes.");

		if (num1 > num2) {
			System.out.println(num1 + " e o numero maior");
		} else {
			System.out.println(num2 + " e o numero maior");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		scanner.nextLine();

		if (num1 == num2) {
			System.out.println("Numeros iguais.");
		} else {
			printMaior(num1, num2);
		}

		scanner.close();

	}

}
