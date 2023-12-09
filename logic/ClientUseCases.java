/**
 * Esta classe contém métodos para gerenciar casos de uso do cliente.
 */
package logic;

import exceptions.CPFAlreadyRegisteredException;
import exceptions.InvalidCPFException;
import exceptions.NotOldEnoughException;

import java.time.LocalDate;
import java.util.Date;

public class ClientUseCases {
	/**
	 * Procura um cliente pelo CPF e retorna o cliente encontrado ou null se nenhum cliente for encontrado.
	 *
	 * @param cpf O número do CPF a ser procurado.
	 * @return O cliente encontrado ou null se nenhum cliente for encontrado.
	 */
	public static ICliente encontrarPorCPF(String cpf) {
		return ClientDatabase.getClientsCopy()
				.stream()
				.filter(client -> client.getCPF().equals(cpf))
				.findFirst()
				.orElse(null);
	}

	/**
	 * Valida as informações fornecidas e lança uma exceção se as informações forem inválidas.
	 *
	 * @param cpf O número do CPF a ser validado.
	 * @param dataDeNascimento A data de nascimento a ser validada.
	 * @param email O e-mail a ser validado.
	 * @throws CPFAlreadyRegisteredException Lançada quando o CPF já está registrado.
	 * @throws InvalidCPFException Lançada quando o CPF é inválido.
	 * @throws NotOldEnoughException Lançada quando o usuário não tem idade suficiente (18 anos).
	 */
	public static void validarInfo(String cpf, LocalDate dataDeNascimento, String email)
			throws CPFAlreadyRegisteredException, InvalidCPFException, NotOldEnoughException {
		if (encontrarPorCPF(cpf) != null) {
			throw new CPFAlreadyRegisteredException(cpf);
		}

		if (!validarCPF(cpf)) {
			throw new InvalidCPFException(cpf);
		}

		LocalDate localDate = LocalDate.now();
		boolean isOver18 = dataDeNascimento.plusYears(18).isBefore(localDate);
		if (!isOver18) {
			throw new NotOldEnoughException();
		}
	}

	/**
	 * Registra um novo cliente com as informações fornecidas.
	 *
	 * @param nomeCompleto O nome completo do cliente.
	 * @param cpf O número do CPF do cliente.
	 * @param nascimento A data de nascimento do cliente.
	 * @param email O e-mail do cliente.
	 * @param celular O número do celular do cliente.
	 * @param contato As informações de contato do cliente.
	 */
	public static void registrarNovoCliente(
			String nomeCompleto,
			String cpf,
			Date nascimento,
			String email,
			String celular,
			String contato
	) {
		ICliente client = new Cliente(
				nomeCompleto,
				cpf,
				nascimento,
				email,
				celular,
				contato
		);

		ClientDatabase.add(client);
		ClientDatabase.saveToFile();
	}

	/**
	 * Verifica se o CPF fornecido é válido.
	 *
	 * @param cpf O número do CPF a ser validado.
	 * @return True se o CPF for válido, false caso contrário.
	 */
	private static boolean validarCPF(String cpf) {
		// Remove caracteres não numéricos
		cpf = cpf.replaceAll("[^0-9]", "");

		// Verifica se o CPF tem 11 dígitos
		if (cpf.length() != 11) {
			return false;
		}

		// Calcula o primeiro dígito verificador
		int soma = 0;
		for (int i = 0; i < 9; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
		}
		int digito1 = 11 - (soma % 11);
		digito1 = (digito1 > 9) ? 0 : digito1;

		// Calcula o segundo dígito verificador
		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
		}
		int digito2 = 11 - (soma % 11);
		digito2 = (digito2 > 9) ? 0 : digito2;

		// Verifica se os dígitos verificadores estão corretos
		boolean primeiroDigitoCorreto = Character.getNumericValue(cpf.charAt(9)) == digito1;
		boolean segundoDigitoCorreto = Character.getNumericValue(cpf.charAt(10)) == digito2;
		return primeiroDigitoCorreto && segundoDigitoCorreto;
	}
}