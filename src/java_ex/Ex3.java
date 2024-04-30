//Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
//total percorrida pelo automóvel e o total de combustível gasto;


package java_ex;

public class Ex3 {
	
	static void print_consumo_medio(float distancia_percorrida, float combustivel_gasto) {
		
		float consumo_medio = distancia_percorrida/ combustivel_gasto ;
		
		System.out.print("o consumo medio do automovel foi de: " + consumo_medio + "Km por litro");
		}

	public static void main(String[] args) {
		
		print_consumo_medio(500.0f, 100.0f );
		

	}

}
