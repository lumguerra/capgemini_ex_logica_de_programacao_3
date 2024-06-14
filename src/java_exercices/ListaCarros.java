package java_exercices;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaCarros {

	public static void main(String[] args) {
		
		ArrayList<String> ListaCarros = new ArrayList<>();
		boolean continuaCadastro = true;
		String arrayString = "";
		String carroParaCadastro = "";
		
		while(continuaCadastro){
			
			ListaCarros.add(JOptionPane.showInputDialog("Digite o nome do carro: "));
			String resposta = JOptionPane.showInputDialog("Deseja cadastrar outro carro? s/n");
			if(resposta.equals("n") || resposta.equals("N")) {
				continuaCadastro = false;
			}
			
		}
		
		System.out.println("Carros cadastrados: ");
		for(String carro : ListaCarros) {
			System.out.println(carro);
		}
		
			
		arrayString = JOptionPane.showInputDialog("Digite o nome do carro para substuir o " + ListaCarros.get(2));
		ListaCarros.set(2, arrayString);
		
		System.out.println("===============");
		System.out.println("Lista atualizada: ");
		for(String carro : ListaCarros) {
			System.out.println(carro);
		}
	}

}
