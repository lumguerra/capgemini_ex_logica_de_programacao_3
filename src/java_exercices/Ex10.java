//A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
//algoritmo que receba um valor de uma compra e mostre o valor das prestações;


//input: valor_compra
//processing: calcularPrestacoes()
//output: valor_prestacoes

package java_exercices;
import java.util.Scanner;

public class Ex10 {
	
	static float calcularPrestacoes(float valor_compra) {
		return valor_compra / 5;
	}

	public static void main(String[] args) {
		
		float valor_compra = 0.0f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor da compra: ");		
		valor_compra = scanner.nextFloat();
		
		float valor_prestacoes = calcularPrestacoes(valor_compra);
		System.out.print("O valor de cada uma das cinco prestações é de: " + valor_prestacoes);
		
	}

}
