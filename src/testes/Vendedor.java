package testes;

public class Vendedor extends Funcionario {

	private int total_itens_vendidos;
	private float comissao_por_item;

	public Vendedor() {
		super();
	}

	// Getters
    public int getTotalItensVendidos() {
        return total_itens_vendidos;
    }

    public float getComissaoPorItem() {
        return comissao_por_item;
    }

    // Setters
    public void setTotalItensVendidos(int totalItensVendidos) {
        this.total_itens_vendidos = totalItensVendidos;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissao_por_item = comissaoPorItem;
    }

    // Methods
    public float calcularSalario() {
        return super.getSalario() + (this.comissao_por_item * this.total_itens_vendidos);
    }

}
