//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
//preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

package java_exercices;

import java.util.Scanner;

public class Ex11 {

	static float calcularValorVenda(float preco_custo, int percentual_acrescimo) {
		return preco_custo + (preco_custo * ((float) percentual_acrescimo / 100));
		 
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o preco de custo: ");
		float preco_de_custo = scanner.nextFloat();
		System.out.println("Digite o percentual de acrescimo: ");
		int percentual_acrecimo = scanner.nextInt();
		calcularValorVenda(preco_de_custo, percentual_acrecimo);
		float valor_venda = calcularValorVenda(preco_de_custo, percentual_acrecimo);
		System.out.print("O valor de venda e: " + valor_venda);

	}

}
