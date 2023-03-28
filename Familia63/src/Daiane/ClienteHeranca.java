package poo;

public class ClienteHeranca {
	private String nome;
	private String endereco;
	private String email;
	private String rg;
	private float renda;
	
	public ClienteHeranca(String nome, String endereco, String email, String rg, float renda) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.rg = rg;
		this.renda = renda;
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



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public float getRenda() {
		return renda;
	}



	public void setRenda(float renda) {
		this.renda = renda;
	}



	public void validarcredito () {
		if (getRenda() >  2000) {
			System.out.println("\nCrédito aprovado!");
		} else 
			System.out.println("\nCrédito não aprovado!");
	
	}
		
	
}