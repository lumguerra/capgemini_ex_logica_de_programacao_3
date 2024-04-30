package fatura_loja_informatica;

public class Invoice {

	private int item_faturado = 0;
	private String descricao = "none";
	private int quantidade = 0;
	private float preco_unitario = 0.0f;

	Invoice(int item_faturado, String descricao, int quantidade, float preco_unitario) {

		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}

		if (preco_unitario < 0) {
			this.preco_unitario = 0;
		} else {
			this.preco_unitario = preco_unitario;
		}

		this.item_faturado = item_faturado;
		this.descricao = descricao;

	}
	
	Invoice(){};

	double getInvoiceAmount() {return this.quantidade * this.preco_unitario;}

	// Getters and setters:
	int getItemFaturado() {return this.item_faturado;}

	void setItemFaturado(int item_faturado) {this.item_faturado = item_faturado;}

	String getDescricao() {return this.descricao;}

	void setDescricao(String descricao) {this.descricao = descricao;}

	int getQuantidade() {return this.quantidade;}

	void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			this.quantidade = 0;
		} else {
			this.quantidade = quantidade;
		}
	}

	float getPrecoUnitario() {return preco_unitario;}

	void setPrecoUnitario(float preco_unitario) {
		if (preco_unitario < 0) {
			this.preco_unitario = 0;
		} else {
			this.preco_unitario = preco_unitario;
		}
	}

}