//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
//possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
//trocados; 

package java_exercices;
import java.util.Scanner;

public class Ex6 {
	
	static void inverter_valores(int valor_a, int valor_b) {
		
		int temp = valor_a;
		valor_a = valor_b;
		valor_b = temp;
				
		System.out.println("Valor A: " + valor_a);
		System.out.println("Valor B: " + valor_b);
		
	}

	public static void main(String[] args) {
		
		int valor_a = 0;
		int valor_b = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Digite o valor A: ");
		valor_a = scanner.nextInt();
		System.out.print(" Digite o valor B: ");
		valor_b = scanner.nextInt();
		
		inverter_valores(valor_a, valor_b);	
		
		
	}

}
