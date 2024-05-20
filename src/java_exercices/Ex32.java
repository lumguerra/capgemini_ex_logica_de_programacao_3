//Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
//Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
//Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
//outros dois lados.
//a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
//b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
//c. Triângulo equilátero é também isóscele;
//d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;


//ler 3 valores inteiros
//verificarSeTriangulo(){ }
//tipoDeTriangulo(){  return equilatero, isoscele ou escaleno}


package java_exercices;

import java.util.Scanner;

public class Ex32 {

	static String tipoDeTriangulo(int ladoA, int ladoB, int ladoC) {
		
		String tipoDeTriangulo = "nulo";
		
		if(ladoA == ladoB && ladoA == ladoC) {
			tipoDeTriangulo = "Equilatero";
		}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			tipoDeTriangulo = "Isóscele";
		}else {
			tipoDeTriangulo = "Escaleno";
		}
		
		return tipoDeTriangulo;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String tipoDeTriangulo = "none";
		
		System.out.println("Digite o valor do lado A: ");
		int ladoA = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite o valor do lado B: ");
		int ladoB= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite o valor do lado C: ");
		int ladoC= scanner.nextInt();
		scanner.nextLine();
		
		tipoDeTriangulo = tipoDeTriangulo(ladoA, ladoB, ladoC);
		
		System.out.print(tipoDeTriangulo);
		
		scanner.close();

	}

}
