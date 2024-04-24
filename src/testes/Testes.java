package testes;

public class Testes {

	public static void main(String[] args) {

		Vendedor vendedor1 = new Vendedor();
		vendedor1.setNome("Claudianus");
		vendedor1.setSalario(1000.00f);
		vendedor1.setCpf("099.888.888-54");
		vendedor1.setDataNascimento(null);
		vendedor1.setComissaoPorItem(10.0f);
		vendedor1.setTotalItensVendidos(5);

		System.out.print(vendedor1.calcularSalario());

	}

}
