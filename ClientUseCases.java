import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

public class ClientUseCases {
	public static LinkedList<ICliente> clients = new LinkedList<>();

	public static ICliente encontrarPorCPF(String cpf){
		return clients.stream()
				.filter(client -> client.getCPF().equals(cpf))
				.findFirst()
				.orElse(null);
	}

	// Valida as informações, caso estejam erradas, causa um erro
	public static void validarInfo(String cpf, LocalDate dataDeNascimento, String email){
		if(encontrarPorCPF(cpf) != null){
			// Erro: Já cadastrado
		}

		if(!validarCPF(cpf)){
			// Erro: CPF inválido
		}

		LocalDate localDate = LocalDate.now();
		boolean isOver18 = dataDeNascimento.plusYears(18).isBefore(localDate);
		if(!isOver18){
			// Erro: Menor de idade
		}
	}

	public static void registrarNovoCliente(
			String nomeCompleto,
			String cpf,
			Date nascimento,
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

	private static boolean validarCPF(String cpf) {
		// Remover caracteres não numéricos
		cpf = cpf.replaceAll("[^0-9]", "");

		// Verificar se o CPF tem 11 dígitos
		if (cpf.length() != 11) {
			return false;
		}

		// Calcular o primeiro dígito verificador
		int soma = 0;
		for (int i = 0; i < 9; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
		}
		int digito1 = 11 - (soma % 11);
		if (digito1 > 9) {
			digito1 = 0;
		}

		// Calcular o segundo dígito verificador
		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
		}
		int digito2 = 11 - (soma % 11);
		if (digito2 > 9) {
			digito2 = 0;
		}

		// Verificar se os dígitos verificadores estão corretos
		boolean primeiroDigitoCorreto = Character.getNumericValue(cpf.charAt(9)) == digito1;
		boolean segundoDigitoCorreto = Character.getNumericValue(cpf.charAt(10)) == digito2;
		return  primeiroDigitoCorreto && segundoDigitoCorreto;
	}
}