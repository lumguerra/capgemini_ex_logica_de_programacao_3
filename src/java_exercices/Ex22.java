//Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
//se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
//de venda de cada produto, amédia de preço de custo e do preço de venda;

package java_exercices;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; ++i) {
			System.out.println("Digite o preco de custo do produto: ");
			float preco_custo = scanner.nextFloat();
			scanner.nextLine();
			System.out.println("Digite o valor de venda do produto: ");
			float valor_venda = scanner.nextFloat();
			scanner.nextLine();
			float diferenca_de_valor = valor_venda - preco_custo;
			
			if(valor_venda > preco_custo) {
				System.out.println(" Lucro de " + diferenca_de_valor);
				System.out.println(" Preco de custo = R$ " + preco_custo);
			}
		}
		
		scanner.close();
		
		
	}

}
