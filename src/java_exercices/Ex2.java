//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
//dos dois números lidos;


package java_exercices;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		float valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor: ");
		float valor2 = scanner.nextInt();

		float soma = valor1 + valor2;
		float subtracao = valor1 - valor2;
		float divisao = valor1 / valor2;
		float multiplicacao = valor1 * valor2;

		System.out.println("a soma dos dois valores é: " + soma);
		System.out.println("a subtracao dos dois valores é: " + subtracao);
		System.out.println("a divisao dos dois valores é: " + divisao);
		System.out.println("a multiplicacao dos dois valores é: " + multiplicacao);

	}

}
