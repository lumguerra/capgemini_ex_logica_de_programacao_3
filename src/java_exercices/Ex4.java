//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
//por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
//efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

package java_exercices;
import java.util.Scanner;

public class Ex4 {
	
	public static float calcular_comissao(int total_de_vendas, float valor_produto) {
		
		return (float) ((total_de_vendas * valor_produto) * 0.15);
		
	}

	public static void main(String[] args) {
		
		String nome = "none";
		float salario = 0.0f;
		int total_de_vendas = 0;
		float valor_produto = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor: ");
		nome = scanner.nextLine();
		System.out.println("Digite o salário do vendedor: ");
		salario = scanner.nextFloat();
		System.out.println("Digite o total de vendas efetuadas no mês: ");
		total_de_vendas = scanner.nextInt();
		System.out.println("Digite o valor do produto vendido pelo vendedor: ");
		valor_produto = scanner.nextFloat();
		
		float salario_final = salario + calcular_comissao(total_de_vendas, valor_produto);
		
		System.out.println("O nome do vendedor é: " + nome);
		System.out.println("O salario fixo do vendedor é: " + salario);
		System.out.println("O salario final (Com comissão) do vendedor é: " + salario_final);
		
	}

}
