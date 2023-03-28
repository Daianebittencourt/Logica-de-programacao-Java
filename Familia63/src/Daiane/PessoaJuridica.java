package poo;

public class PessoaJuridica extends ClienteHeranca {
	 private String cnpj;

	
	public PessoaJuridica(String nome, String endereco, String email, String rg, float renda, String cnpj) {
		super(nome, endereco, email, rg, renda);
		this.cnpj = cnpj;
	}

	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public void visualizar () {
		System.out.println("*****************************");
		System.out.println("      Dados do Cliente      ");
		System.out.println("*****************************");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getEndereco());
		System.out.println("Profissão: "+getEmail());
		System.out.println("E-mail: "+getRg());
		System.out.printf("\nRenda: "+getRenda());
		System.out.println("\nCNPJ: "+getCnpj());
	}
	
	 
}
