//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
//conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;


package java_exercices;
import java.util.Scanner;

public class Ex7 {

	static float converter_temp(float celsius_temp) {
		return (celsius_temp * 9/5) + 32;
	}
	
	public static void main(String[] args) {
		
		float celsius_temp = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius_temp = scanner.nextFloat();
		
		float fahrenheit_temp = converter_temp(celsius_temp);
		
		System.out.print("esssa temperatura em Fahrenheit é : " + fahrenheit_temp);		

	}

}
