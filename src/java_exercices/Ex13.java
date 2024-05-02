//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;

package java_exercices;

import java.util.Scanner;

public class Ex13 {

	static boolean check_num(int num) {

		boolean is_bigger = true;

		if (num <= 10) {
			is_bigger = false;
		}

		return is_bigger;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		if (check_num(num)) {
			System.out.println("Numero maior que 10.");
		}
	}

}
