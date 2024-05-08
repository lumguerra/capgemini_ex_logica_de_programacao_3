//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
//um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
//desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
//sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
//Informar total de carros com ano até 2000 e total geral;

//input: while(){ano_carro, valor_carro}
//processing: exibirValorDesconto(){ate 200 - 12%, acimda de 200 7%, }

package java_exercices;

import java.util.Scanner;

public class Ex20 {

	static void exibirValorDesconto(int ano, float valor) {
		float valor_desconto;
		if (ano <= 2000) {
			valor_desconto = valor * 0.12f;
			System.out.println("Valor do desconto (12%): " + valor_desconto);
			System.out.println("Valor a pagar: " + (valor - valor_desconto));
		} else {
			valor_desconto = valor * 0.07f;
			System.out.println("Valor do desconto (7%): " + valor_desconto);
			System.out.println("Valor a pagar: " + (valor - valor_desconto));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		int totalCarrosAte2000 = 0, totalGeral = 0;

		while (continuar) {
			System.out.println("Deseja calcular o desconto do carro? (S/N)");
			String input = scanner.nextLine().trim();
			if (input.isEmpty() || (input.charAt(0) != 'S' && input.charAt(0) != 'N')) {
				System.out.println("Resposta inválida. Por favor, digite 'S' para sim ou 'N' para não.");
				continue;
			}
			char resposta = input.charAt(0);

			if (resposta == 'N') {
				continuar = false;
				continue;
			}

			System.out.println("Digite o ano do carro:");
			int ano = scanner.nextInt(); // Ler o próximo inteiro
			System.out.println("Digite o valor do carro:");
			float valor = scanner.nextFloat(); // Ler o próximo float
		
			exibirValorDesconto(ano, valor);

			if (ano <= 2000) {
				totalCarrosAte2000++;
			}
			totalGeral++;
		}

		System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
		System.out.println("Total geral de carros: " + totalGeral);

		scanner.close();
	}
}
