package java_exercices;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Collections;

public class Embarque {

	public static void main(String[] args) {
		
		int qtdAeronaves = (Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de aeronaves no pátio?")));
		LinkedList<Integer> voos = new LinkedList<>();
		for(int i = 0; i < qtdAeronaves; ++i) {
			voos.add(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da aeronave " + (i + 1) + ": ")));
		}
		
		System.out.println("Lista dos voos: ");
		System.out.println(voos.toString());
		
		System.out.println("Primeiro vôo a decolar: " + voos.get(0));

	}

}
