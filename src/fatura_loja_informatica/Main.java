package fatura_loja_informatica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean sistema_ativo = true;
		Scanner scanner = new Scanner(System.in);

		while (sistema_ativo) {
			System.out.println("Deseja cadastrar nova Invoice? (s/n)");
			char resposta = scanner.nextLine().charAt(0);

			if (resposta == 's') {
				Invoice i = new Invoice();
				System.out.println("Digite o numero da invoice: ");
				int num = scanner.nextInt();
				i.setItemFaturado(num);
				System.out.println("Digite a descrição da invoice: ");
				scanner.nextLine();
				String descricao = scanner.nextLine();				
				i.setDescricao(descricao);
				System.out.println("Digite a quantidade de itens: ");
				int quantidade = scanner.nextInt();
				i.setQuantidade(quantidade);
				System.out.println("Digite o preço do item: ");
				float preco = scanner.nextFloat();
				i.setPrecoUnitario(preco);
				System.out.println("Invoice cadastrada com sucesso! Descrição: ");
				System.out.println("========================================");
				System.out.println("Numero da invoice: " + i.getItemFaturado());
				System.out.println("Descrição: " + i.getDescricao());
				System.out.println("Quantidade: " + i.getQuantidade());
				System.out.println("Preço do item: " + i.getPrecoUnitario());
				System.out.println("========================================");
			} else if (resposta == 'n') {
				sistema_ativo = false;
				System.out.println("Sistema finalizado.");
			} else {
				System.out.println("resposta invalida./  Digite s ou n.");
			}
		}
	}
}
