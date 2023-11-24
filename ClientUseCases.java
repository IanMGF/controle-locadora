public class ClienteUseCases {
	public static LinkedList<ICliente> clients = LinkedList<>();

	public static ICliente encontrarPorCPF(String cpf){
		for(ICliente client: clients){
			if(client.cpf == cpf){
				return client;
			}
		}
		return null;
	}

	// Valida as informações, caso estejam erradas, causa um erro
	public static void validarInfo(String cpf, String dataDeNascimento, String email){
		if(searchByCPF(cpf) != null){
			// Erro: Já cadastrado
		}

		// Validar CPF

		LocalDate localDate = LocalDate.now();
		// long ms = localDate.getTime() - dataDeNascimento.getTime()
		// int years = ms / 6570 // Aproximadamente 18 anos
		int years = 0;

		if(years < 18){
			// Erro: Menor de idade
		}
	}

	public static void registrarNovoCliente(
			String nomeCompleto,
			String cpf,
			String nascimento,
			String email,
			String celular,
			String contato,
		){
		ICliente client = new Cliente(
				nomeCompleto,
				cpf,
				nascimento,
				email,
				celular,
				contato
			)

		clients.add(client)
	}
}