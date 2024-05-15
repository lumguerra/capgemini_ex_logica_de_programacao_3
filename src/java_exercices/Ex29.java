//Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;

package java_exercices;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean sistema_ativo = true;
		
		do {
			
			System.out.println("Digite o numero do mes, ou 0 para sair: ");
			int mes = scanner.nextInt();
			switch(mes) {
			
			case 0:
				sistema_ativo = false;
				break;
			case 1:
				System.out.println("Janeiro.");
				break;
			case 2:
				System.out.println("Fevereiro.");
				break;
			case 3:
				System.out.println("Marco.");
				break;
			case 4:
				System.out.println("Abril.");
				break;
			case 5:
				System.out.println("Maio.");
				break;
			case 6:
				System.out.println("Junho.");
				break;
			case 7:
				System.out.println("Julho.");
				break;
			case 8:
				System.out.println("Agosto.");
				break;
			case 9:
				System.out.println("Setembro.");
				break;
			case 10:
				System.out.println("Outubro.");
				break;
			case 11:
				System.out.println("Novembro.");
				break;
			case 12:
				System.out.println("Dezembro.");
				break;						
			default:
				System.out.println("Numero invalido.");
				break;
			}
			
		}while(sistema_ativo);
		
		System.out.println("Sistema finalizado");
		scanner.close();
		
	}

}
