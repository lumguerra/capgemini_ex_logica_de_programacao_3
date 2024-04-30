package java_exercices;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = scanner.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.print("a soma dos dois valores é: " + soma);
	}

}
