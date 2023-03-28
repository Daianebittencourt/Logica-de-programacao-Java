package poo;

public class PessoaFisica extends ClienteHeranca {

	private String cpf;
	
	
	public PessoaFisica(String nome, String endereco, String email, String rg, float renda, String cpf) {
		super(nome, endereco, email, rg, renda);
		this.cpf = cpf;
	}
	

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		System.out.println("\nCPF; "+getCpf());
		
	}
	
}
