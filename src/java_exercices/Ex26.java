//Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
//que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;


package java_exercices;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 e 5.");
		int num = scanner.nextInt();
		scanner.nextLine();
		if(num < 0 || num > 5) {
			System.out.println("numero invalido");
		}else {
			switch(num) {
				case 1:
					System.out.println("um");
					break;
				case 2:
					System.out.println("dois");
					break;
				case 3:
					System.out.println("tres");
					break;
				case 4:
					System.out.println("quatro");
					break;
				case 5:
					System.out.println("cinco");
					break;					
			}
		}
		
		scanner.close();

	}

}
