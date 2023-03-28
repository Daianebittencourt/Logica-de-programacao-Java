package poo;

public class TesteClienteHeranca {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica ("Daiane","Rua Inventada, 123", "daiane@dmail.com","34.765.84-0",2500,"546.957.885-27");
		PessoaJuridica pj = new PessoaJuridica("Rafaela", "Rua das Pedras,1", "rafaela@rgmail.com", "45.123.453.5",7000, "03.806.115/0001-79");
		
		pf.visualizar();
		pj.visualizar();
	}

}
