package poo;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private String rg;
	public Cliente(String nome, String endereco, String email, String cpf, String rg) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void imprimir() {
		System.out.println("*****************************");
		System.out.println("      Dados do Cliente      ");
		System.out.println("*****************************");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.endereco);
		System.out.println("Profissão: "+this.email);
		System.out.println("Renda: "+this.cpf);
		System.out.println("E-mail: "+this.rg);
	
	}

}
