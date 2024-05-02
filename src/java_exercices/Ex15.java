//Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

package java_exercices;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num = scanner.nextInt();
		if (num >= 100 && num <= 200) {
			System.out.println("O numero " + num + " esta entre 100 e 200.");
		} else {
			System.out.println("O numero " + num + " NAO esta entre 100 e 200.");
		}

	}

}
