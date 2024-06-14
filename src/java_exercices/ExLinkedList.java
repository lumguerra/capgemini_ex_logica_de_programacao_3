package java_exercices;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ExLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> listaNum = new LinkedList<>();
		int num = 0;
		
		for(int i = 0; i < 4; ++i) {
			listaNum.addFirst(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
		}
		
		listaNum.addFirst(144);
		System.out.println(listaNum);
		listaNum.addLast(999);
		System.out.println(listaNum);
		listaNum.removeFirst();
		System.out.println(listaNum);
		listaNum.removeLast();
		System.out.println(listaNum);
		System.out.println("Primeiro numero: ");
		num = listaNum.getFirst();
		System.out.println(num);
		System.out.println("Último número: ");
		num = listaNum.getLast();
	}

}
