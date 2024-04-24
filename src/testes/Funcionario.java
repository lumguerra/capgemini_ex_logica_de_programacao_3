package testes;

import java.util.Date;

public class Funcionario {

	private String nome;
	private String cpf;
	private Date data_nascimento;
	private float salario;

	public Funcionario() {

	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return data_nascimento;
	}

	public float getSalario() {
		return salario;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.data_nascimento = dataNascimento;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
