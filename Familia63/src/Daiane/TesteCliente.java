package poo;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Daiane", "Rua Inventada,123","daiane@dmail.com","479.075.228-12","37.261.478-0");
		Cliente cliente2 = new Cliente ("Rafaela", "Rua das Pedras, 1", "rafaela@rgmail.com", "356.096.663-04", "64.835.045-9");
		
		cliente1.imprimir();
		cliente2.imprimir();
	}

}
