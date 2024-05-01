//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
//mês.Considere fixo o juro da poupança em 0,07% a. m;

//input: valor_depositado
//processing: printRendimento()
//output: 

package java_exercices;
import java.util.Scanner;

public class Ex9 {

	static void printRendimento(float valor_depositado) {
		float rendimento = (float) (valor_depositado * 0.07);
		System.out.print(valor_depositado + rendimento);
	}
	
	public static void main(String[] args) {
		
		float valor_depositado = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("digite o valor depositado: ");
		valor_depositado = scanner.nextFloat();
		System.out.print("O valor com rendimento apos um mês é: ");
		printRendimento(valor_depositado);
		
	}

}
