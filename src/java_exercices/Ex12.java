//O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e
//dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
//do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
//45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
//mesmo;

//input: custo_inicial
//processing: calcular_custo(){ imposto 45% sobre custo_inicial + percentual_distribuidor 28% }
//output: custo_final

package java_exercices;

import java.util.Scanner;

public class Ex12 {

	static float calcular_custo(float custo_inicial) {
		return (float) (custo_inicial + (custo_inicial * 0.45) + (custo_inicial * 0.28));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o custo de fabrica do carro: ");
		float custo_inicial = scanner.nextFloat();
		float custo_final = calcular_custo(custo_inicial);
		System.out.print(custo_final);

	}

}
