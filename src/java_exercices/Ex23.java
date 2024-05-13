//Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
//menor que 25 ou igual a 40

package java_exercices;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		scanner.nextLine();
		if (num > 80 || num < 25 || num == 40) {
			System.out.print("Numero é maior que 80, OU menor que 25, OU igual a 40.");
		}

		scanner.close();

	}

}
