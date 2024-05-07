//Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
//mulher. No final informe total de homens e de mulheres;

package java_exercices;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex19 {

	static void printQuantidadeMeF(ArrayList<Boolean> is_man) {

		int contagem_homem = 0;
		int contagem_mulher = 0;

		for (Boolean i : is_man) {
			if (i == true) {
				++contagem_homem;
			} else {
				++contagem_mulher;
			}
		}

		System.out.println("Quantidade de homens: " + contagem_homem);
		System.out.println("Quantidade de mulheres: " + contagem_mulher);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Boolean> is_man = new ArrayList<Boolean>();

		for (int i = 0; i < 56; ++i) {
			char sexo = 'X';
			System.out.println("Digite o nome: ");
			String nome = scanner.nextLine();
			System.out.println("Digite o sexo (M/F): ");
			sexo = scanner.nextLine().charAt(0);
			while (sexo != 'M' && sexo != 'F') {
				System.out.println("valor nao identificado. Digite apenas 'F' para feminino ou 'M' para masculino.");
				sexo = scanner.nextLine().charAt(0);
			}
			if (sexo == 'M') {
				System.out.println(nome + " é homem.");
				is_man.add(true);
			} else if (sexo == 'F') {
				System.out.println(nome + " é mulher.");
				is_man.add(false);
			}
		}
		
		printQuantidadeMeF(is_man);

		scanner.close();

	}

}
