package cadastros;

public class Pessoa extends Dao{

	private int idPessoa;
	private String nomePessoa;
	private String emailPessoa;
	
	//Constructors:
	Pessoa(){};
	
	Pessoa(String nomePessoa, String emailPessoa){
		this.nomePessoa = nomePessoa;
		this.emailPessoa = emailPessoa;
	}
	
	Pessoa(int idPessoa, String nomePessoa, String emailPessoa){
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.emailPessoa = emailPessoa;
	}
	
	//Getters and Setters:
	void setIdPessoa(int id){this.idPessoa = id;}
	int getIdPessoa() {return this.idPessoa;}
	void setNomePessoa(String nomePessoa) {this.nomePessoa = nomePessoa;}
	String getNomePessoa() {return nomePessoa;}
	void setEmailPessoa(String emailPessoa) {this.emailPessoa = emailPessoa;}
	String getEmailPessoa() {return this.emailPessoa;}
	

}
