//Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
//ou não para cumprir o serviço militar obrigatório. Informe os totais;

package java_exercices;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; ++i) {
			System.out.println("Digite o nome da pessoa: ");
			String nome = scanner.nextLine();
			System.out.println("Digite o sexo da pessoa (M/F): ");
			char sexo = scanner.nextLine().charAt(0);
			System.out.println("Digite a idade da pessoa: ");
			int idade = scanner.nextInt();
			System.out.println("Digite a saúde da pessoa (boa/ruim): ");
			scanner.nextLine();
			String saude = scanner.nextLine();

			if (sexo == 'M' && idade >= 18 && saude.equals("boa") ) {
				System.out.println(nome + " deverá cumprir o serviço militar obrigatório.");
			} else {
				System.out.println(nome + " não precisa cumprir o serviço militar obrigatório.");
			}
		}
		
		scanner.close();

	}

}
