//Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
//dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
//disponíveis com ousuário;


//input: valor_dolar, cotacao_dolar
//processing: converterParaReal(cotacao_dolar, valor_dolar)
//output: valor_em_real

package java_exercices;
import java.util.Scanner;

public class Ex8 {
	
	static float converterParaReal(float cotacao_dolar, float valor_em_dolar) {
		return cotacao_dolar * valor_em_dolar;
	}

	public static void main(String[] args) {
		
		float valor_em_dolar = 0.0f;
		float cotacao_dolar = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quatos dolares voce deseja converter para Real: ");
		valor_em_dolar = scanner.nextFloat();
		System.out.println("Digite a cotacao atual do dolar: ");
		cotacao_dolar = scanner.nextFloat();
		
		float valor_em_real = converterParaReal(cotacao_dolar, valor_em_dolar);
		
		System.out.print(valor_em_real);

	}

}
