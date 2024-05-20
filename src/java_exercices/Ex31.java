//Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
//resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
//impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;

package java_exercices;

import java.util.Scanner;

public class Ex31 {

	static void calculateOperation(int A, int B, String C) {

		float result = 0;

		switch (C) {

		case "+":
			result = A + B;
			break;

		case "-":
			result = A - B;
			break;

		case "*":
			result = A * B;
			break;

		case "/":
			result = ((float)(A) / (float)(B));
			break;
		}

		System.out.println(result);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean string_valida = true;
		boolean sistema_ativo = true;
		String C = "none";
		char resposta = 'N';
		boolean resposta_valida = true;
		
		
		//template

		do {

			System.out.println("Digite o primeiro valor: ");
			int A = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o segundo valor: ");
			int B = scanner.nextInt();
			scanner.nextLine();

			do {

				System.out.println("Digite o operador: ");
				C = scanner.nextLine();

				if (!C.equals("+") && !C.equals("-") && !C.equals("*") && !C.equals("/")) {
					string_valida = false;
					System.out.println("operador nao identificado. Digite '+' '-' '*' ou '/' ");
				} else {
					string_valida = true;
				}

			} while (!string_valida);

			calculateOperation(A, B, C);

			System.out.println("Deseja calcular novamente? (S/N)");

			do {

				resposta = scanner.nextLine().charAt(0);

				if (resposta == 'N') {
					sistema_ativo = false;
					resposta_valida = true;
				} else if (resposta != 'S') {
					System.out.println("Resposta invalida. Digite S para sim e N para nao.");
					resposta_valida = false;
				} else {
					resposta_valida = true;
				}

			} while (!resposta_valida);

		} while (sistema_ativo);
		
		System.out.print("Sistema finalizado");

		scanner.close();

	}

}
