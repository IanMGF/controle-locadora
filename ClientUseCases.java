import java.time.LocalDate;
import java.util.LinkedList;

public class ClientUseCases {
	public static LinkedList<ICliente> clients = new LinkedList<>();

	public static ICliente encontrarPorCPF(String cpf){
		for(ICliente client: clients){
			if(client.getCPF().equals(cpf)){
				return client;
			}
		}
		return null;
	}

	// Valida as informações, caso estejam erradas, causa um erro
	public static void validarInfo(String cpf, LocalDate dataDeNascimento, String email){
		if(encontrarPorCPF(cpf) != null){
			// Erro: Já cadastrado
		}

		// Validar CPF

		LocalDate localDate = LocalDate.now();
		boolean isOver18 = dataDeNascimento.plusYears(18).isBefore(localDate);
		if(!isOver18){
			// Erro: Menor de idade
		}
	}

	public static void registrarNovoCliente(
			String nomeCompleto,
			String cpf,
			String nascimento,
			String email,
			String celular,
			String contato
		){
		ICliente client = new Cliente(
				nomeCompleto,
				cpf,
				nascimento,
				email,
				celular,
				contato
			);

		clients.add(client);
	}
}