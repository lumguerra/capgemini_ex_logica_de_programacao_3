//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
//“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

package java_exercices;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 75; ++i) {
			System.out.println("Digite uma idade: ");
			int idade = scanner.nextInt();
			if (idade > 18) {
				System.out.println("De maior");
			} else {
				System.out.println("De menor");
			}
		}

	}

}
