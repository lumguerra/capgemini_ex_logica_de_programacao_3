//A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
//calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//a. Professor Nível 1 R$12,00 por hora/aula;
//b. Professor Nível 2 R$17,00 por hora/aula;
//c. Professor Nível 3 R$25,00 por hora/aula.

//

package java_exercices;

import java.util.Scanner;

public class Ex33 {
	
	static float calcularSalario(int nivel) {
		
		float salario = 0.0f;
		
		switch(nivel) {
			case 1:
				salario = 160 * 12;
				break;
			case 2:
				salario = 150 * 17;
				break;
			case 3:
				salario = 150 * 25;
				break;
		}
		
		return salario;
		
		
	}

	public static void main(String[] args) {
		
		boolean sistema_ativo = true;
		Scanner scanner = new Scanner(System.in);
		int resposta = 0;
		
		System.out.println("Bem vindo a escola APRENDER!");
		
		while(sistema_ativo) {
			
			System.out.print("Para calcular o salario do professor, digite o nivel dele (1, 2 ou 3)");
			resposta  = scanner.nextInt();
			scanner.nextLine();
			
			boolean resposta_valida = true;
			
			do {
				if(resposta != 1 && resposta != 2 && resposta != 3) {
					resposta_valida = false;
					System.out.println("Resposta invalida. Digite 1 , 2 ou 3: ");
					resposta  = scanner.nextInt();
					scanner.nextLine();
				}else {
					resposta_valida = true;
				}
			}while(!resposta_valida);
			
			float salario = calcularSalario(resposta);
			
			System.out.println("Salario do professor: " + salario);
			System.out.println("Digite 1 para calcular outro salario, ou 2 para sair.");
			resposta  = scanner.nextInt();
			scanner.nextLine();
						
			do {
				if(resposta != 1 && resposta != 2) {
					resposta_valida = false;
					System.out.println("Resposta invalida. Digite 1 ou 2");
					resposta  = scanner.nextInt();
					scanner.nextLine();
				}else if(resposta == 1) {
					resposta_valida = true;					
				}else {
					System.out.println("Sistema finalizado.");
					resposta_valida = true;	
					sistema_ativo = false;
				}
			}while(!resposta_valida);						
			
		}
		
		
	}

}
