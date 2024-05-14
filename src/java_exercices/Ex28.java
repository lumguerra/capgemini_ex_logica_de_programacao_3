//Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
//com os seguintes critérios:
//a. 50% para aqueles que ganham menos do que três salários mínimos;
//b. 20% para aqueles que ganham entre três até dez salários mínimos;
//c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
//d. 10% para os demais funcionários
//Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
//reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
//vai aumentar sua folha de pagamento;

///ler inputs: nome, salario e salario minimo/ calcularReajuste(){ adicionar condicoes pritar nome, rejuste e o salario.} calcularFolhaPagamento()

package java_exercices;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex28 {

	static float calcularReajuste(String nome, float salario_minimo, float salario) {
		
		float quantidade_de_salarios = salario / salario_minimo;
		float reajuste = 0.0f;		
		
		if(quantidade_de_salarios < 3) {
			reajuste = 0.5f;
		}else if(quantidade_de_salarios >= 3 && quantidade_de_salarios <= 10) {
			reajuste = 0.2f;
		}else if(quantidade_de_salarios >10 && quantidade_de_salarios <= 20) {
			reajuste = 0.15f;
		}else{
			reajuste = 0.1f;
		}
		
		return reajuste;	
			
	}
	
	static void exibirFolhaPagamento(ArrayList<Float> registro_de_reajustes) {
		
		float soma_reajustes = 0.0f;
		
		for(float i : registro_de_reajustes) {			
			soma_reajustes += i;
		}
		
		System.out.println("A empresa ira aumentar um total de " + soma_reajustes + " reais a sua folha de pagamento.");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float salario_minimo = 1300.00f;
		ArrayList<Float> registro_de_reajustes = new ArrayList<>();	
		boolean sistema_ativo = true;
		float reajuste = 0.0f;
		char resposta_cadastro;

		while (sistema_ativo) {
			
			boolean resposta_valida = false;
			String nome;
			float salario;
			
			System.out.println("Digite o nome do funcionario: ");
			nome = scanner.nextLine();
			System.out.println("Digite o salario do/da " + nome + " :");
			salario = scanner.nextFloat();
			scanner.nextLine();
			reajuste = calcularReajuste(nome, salario_minimo, salario);
			registro_de_reajustes.add(reajuste * salario);
			
			System.out.println("Calculo de reajuste para " + nome + " :");
			System.out.println("Salario inicial: " + salario);
			System.out.println("valor do reajuste: " + (salario * reajuste));
			System.out.println("Salario final: " + (salario + (salario * reajuste)));
			System.out.println("Deseja cadastrar outro funcionario? (S/N)");
			
				while(!resposta_valida) {
				
					resposta_cadastro = scanner.nextLine().charAt(0);
				
					if(resposta_cadastro != 'S' && resposta_cadastro != 'N') {
						System.out.println("Resposta invalida. Digite S para sim e N para nao.");
					}else if(resposta_cadastro == 'S') {
						resposta_valida = true;
					}else if(resposta_cadastro == 'N') {
						System.out.println("Cadastro finalizado.");
						resposta_valida = true;
						sistema_ativo = false;
					}

				}
			}
		
			exibirFolhaPagamento(registro_de_reajustes);
		
			scanner.close();
			System.out.print("Fim do programa.");

	}

}
