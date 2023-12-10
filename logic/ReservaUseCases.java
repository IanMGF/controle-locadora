package logic;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * A classe ReservaUseCases fornece funcionalidades para gerenciar reservas de veículos.
 */
public class ReservaUseCases {

	/**
	 * Retorna uma lista de veículos disponíveis no período especificado.
	 * @param dataInicial A data de início do período.
	 * @param dataFinal A data de fim do período.
	 * @return Uma lista de veículos disponíveis.
	 */
	public static List<IVeiculo> encontrarVeiculosPorPeriodo(Date dataInicial, Date dataFinal){
		List<IVeiculo> veiculosInicial = new LinkedList<>(List.of(Frota.getVeiculos()));

		List<IVeiculo> reservados =  ReservaDatabase.getReservasCopy().stream()
													.filter(res -> res.getDataDevolucao().after(dataInicial))
													.filter(res -> res.getDataRetirada().before(dataFinal))
													.map(IReserva::getVeiculo)
													.toList();

		veiculosInicial.removeIf(v -> reservados.stream().anyMatch(v2 -> v.getPlaca().equals(v2.getPlaca())));
		return veiculosInicial;
	}

	/**
	 * Reserva um veículo e retorna o objeto de reserva, já adicionado na base de dados.
	 * @param dataInicial A data de início da reserva.
	 * @param dataFinal A data de fim da reserva.
	 * @param veiculo O veículo a ser reservado.
	 * @param limpezaInt Indica se a limpeza interna será realizada.
	 * @param limpezaExt Indica se a limpeza externa será realizada.
	 * @param seguro Indica se o seguro será incluído na reserva.
	 * @return O objeto de reserva criado.
	 */
	public static IReserva reservarVeiculo(
			Date dataInicial,
			Date dataFinal,
			IVeiculo veiculo,
			String cpf,
			boolean limpezaInt,
			boolean limpezaExt,
			boolean seguro
	){
		try {
			Grupo.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		Grupo g = new Grupo("basico", 0, 0, 0, 0, 0);

		// Calcular total de dias
		long totalDias = (dataFinal.getTime() - dataInicial.getTime()) / (1000 * 60 * 60 * 24);

		float total;
		total = 0;
		total += g.getValorDiaria(veiculo.getGrupo()) * totalDias;
		total += seguro ? g.getDiariaSeguro(veiculo.getGrupo()) * totalDias : 0;

		total += limpezaExt ? g.getValorLimpezaExt(veiculo.getGrupo()) : 0;
		total += limpezaInt ? g.getValorLimpezaInt(veiculo.getGrupo()) : 0;

		veiculo.getGrupo();
		Random random = new Random();
		long randomLong = random.nextLong();
		String codigo = Long.toString(randomLong); // => Gerar string aleatória
		IReserva reserva = new Reserva(
				veiculo,
				dataInicial,
				dataFinal,
				total,
				codigo,
				cpf,
				"ativa"
		);

		ReservaDatabase.add(reserva);
		return reserva;
	}
}