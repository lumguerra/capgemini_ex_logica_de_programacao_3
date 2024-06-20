package cadastros;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	public static void main(String[] args) throws Exception {
		PessoaDao pd = new PessoaDao();
		Pessoa p = new Pessoa();
		List<Pessoa> pessoasList = new ArrayList<>();		
		pessoasList = pd.listarPessoas();
		
		for(Pessoa pessoas : pessoasList) {
			System.out.println(pessoas);
		}
		
		p = pd.consultarPessoa(3);
		if(p != null) {
			pd.excluirPessoa(p);
		}	
		
		pessoasList = pd.listarPessoas();
		
		System.out.print("Lista atualizada: ");
		
		for(Pessoa pessoas : pessoasList) {
			System.out.println(pessoas);
		}
		
		
	}

}
