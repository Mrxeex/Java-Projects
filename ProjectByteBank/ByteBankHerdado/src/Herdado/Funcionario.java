package Herdado;

public class Funcionario{
	private String nome;
	private String cpf;
	private double salario;
	//protected: meio termo entre privado e publico
	//ele continua sendo privado mas é public para os meios filhos
	
	public Funcionario() {
		
	}

	public double getBonificacao() {
		return this.salario * 0.05;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
