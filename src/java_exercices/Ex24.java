//Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;

package java_exercices;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos numeros deseja conferir?");
		int quantidade = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < quantidade; ++i) {
			System.out.println("Digite um numero: ");
			int num = scanner.nextInt();
			scanner.nextLine();
			if(num > 0) {
				System.out.println("Numero positivo.");
			}else if(num < 0) {
				System.out.println("Numero negativo.");
			}else {
				System.out.println("Numero igual a zero.");
			}
		}
		
		scanner.close();
		
	}

}
