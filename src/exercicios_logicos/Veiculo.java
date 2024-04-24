package exercicios_logicos;

public class Veiculo {

	private float valor_veiculo;
	private int ano_veiculo;

	public void calcular_desconto() {

		float desconto;

		if (this.ano_veiculo < 2000) {
			desconto = this.valor_veiculo * 0.12f;
		} else {
			desconto = this.valor_veiculo * 0.7f;
		}

		System.out.println("valor do desconto: " + desconto);
		System.out.println("valor a ser pago pelo cliente: " + (this.valor_veiculo - desconto));

	}

	public void set_valor_veiculo(float valor_veiculo) {
		this.valor_veiculo = valor_veiculo;
	}

	public float get_valor_veiculo() {
		return this.valor_veiculo;
	}

	public void set_ano_veiculo(int ano_veiculo) {
		this.ano_veiculo = ano_veiculo;
	}

	public float get_ano_veiculo() {
		return this.ano_veiculo;
	}

}
