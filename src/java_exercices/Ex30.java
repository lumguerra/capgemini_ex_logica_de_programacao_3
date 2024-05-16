//Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

package java_exercices;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Ex30 {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		final int QTD_NUM = 5;

		int numero;
		
		for(int i = 0; i < QTD_NUM; ++i) {
			System.out.println("Digite um numero: ");
			numero = scanner.nextInt();
			scanner.nextLine();
			arr.add(numero);
		}
		
		Collections.sort(arr);
		
		System.out.print("Array: ");
		
		for(int i : arr) {			
			System.out.print(i + " ");
			System.out.println("");
		}
		
	}

}
