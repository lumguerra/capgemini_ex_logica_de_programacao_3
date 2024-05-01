//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
//No finalinformar o nome do aluno e a sua média (aritmética);

package java_exercices;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex5 {

	static float calcular_media(ArrayList<Float> notas) {

		float total_notas = 0.0f;

		for (int i = 0; i < notas.size(); ++i) {

			total_notas += notas.get(i);

		}

		return total_notas / notas.size();

	}

	public static void main(String[] args) {

		String nome_aluno = "none";
		float nota = 0.0f;
		ArrayList<Float> notas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		nome_aluno = scanner.nextLine();
		System.out.println("Digite a nota da primeira prova: ");
		nota = scanner.nextFloat();
		notas.add(nota);
		System.out.println("Digite a nota da segunda prova: ");
		nota = scanner.nextFloat();
		notas.add(nota);
		System.out.println("Digite a nota da terceira prova: ");
		nota = scanner.nextFloat();
		notas.add(nota);
		
		System.out.println("O aluno " + nome_aluno + " tem a media de " + calcular_media(notas));

	}

}
