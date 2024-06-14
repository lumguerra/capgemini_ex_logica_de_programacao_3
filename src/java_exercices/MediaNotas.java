package java_exercices;
import java.util.Scanner;

public class MediaNotas{
	
	static void exibirDados(String[] alunos, float[] mediaNotas) {
		for(int i = 0; i < alunos.length; ++i) {
			System.out.println("Dados do/da aluno/a " + alunos[i] + ":");
			System.out.println("Media:" + mediaNotas[i]);
			if(mediaNotas[i] >=6) {
				System.out.println("APROVADO");
			}else {
				System.out.println("REPROVADO");
			}					
		}			
	}
	
	public static void main(String [] args){
		
		String[] labelNotas = {"primeira ", "segunda ", "terceira ", "quarta "};
		String[] alunos = {"Lucas", "Sarah", "Oswaldo"};
		float[][] notas = new float[3][4];
		Scanner scanner = new Scanner(System.in);
		float[] mediaNotas = new float[3];
		
		//cadastro de notas:
		for(int i = 0; i < notas.length; ++i) {
			for(int j = 0; j < notas[i].length; ++j) {
				float nota = 0;
				System.out.println("Digite a " + labelNotas[j] + "nota da/do " + alunos[i]);
				nota = scanner.nextFloat();
				notas[i][j] = nota;
			}
		}
		
		//media das notas:
		for(int i = 0; i < notas.length; ++i) {
			float soma = 0;
			for(int j = 0; j < notas[i].length; ++j) {
				soma += notas[i][j];
				mediaNotas[i] = (soma / 4);
			}
		}
		
		exibirDados(alunos, mediaNotas);
		scanner.close();
	}
	
}
