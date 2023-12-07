package logic;

import exceptions.CPFAlreadyRegisteredException;
import exceptions.InvalidCPFException;
import exceptions.NotOldEnoughException;

import java.time.LocalDate;
import java.util.Date;

public class ClientUseCases {
	private static IClientDatabase database;
	public static ICliente encontrarPorCPF(String cpf){
		return database.getClientsCopy()
				.stream()
				.filter(client -> client.getCPF().equals(cpf))
				.findFirst()
				.orElse(null);
	}

	// Valida as informações, caso estejam erradas, causa um erro
	public static void validarInfo(String cpf, LocalDate dataDeNascimento, String email)
			throws CPFAlreadyRegisteredException, InvalidCPFException, NotOldEnoughException
	{
		if(encontrarPorCPF(cpf) != null){
			throw new CPFAlreadyRegisteredException(cpf);
		}

		if(!validarCPF(cpf)){
			throw new InvalidCPFException(cpf);
		}

		LocalDate localDate = LocalDate.now();
		boolean isOver18 = dataDeNascimento.plusYears(18).isBefore(localDate);
		if(!isOver18){
			throw new NotOldEnoughException();
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

		database.add(client);
		database.saveToFile();
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
		digito1 = (digito1 > 9) ? 0 : digito1;

		// Calcular o segundo dígito verificador
		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
		}
		int digito2 = 11 - (soma % 11);
		digito2 = (digito2 > 9) ? 0 : digito2;

		// Verificar se os dígitos verificadores estão corretos
		boolean primeiroDigitoCorreto = Character.getNumericValue(cpf.charAt(9)) == digito1;
		boolean segundoDigitoCorreto = Character.getNumericValue(cpf.charAt(10)) == digito2;
		return  primeiroDigitoCorreto && segundoDigitoCorreto;
	}
}