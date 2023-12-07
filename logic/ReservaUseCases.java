package logic;

import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class ReservaUseCases {
	public List<IReserva> reservas;
	public List<IReserva> reservasAtuais;

	/*
	Retorna uma lista de veículos disponíveis no período
	*/
	public List<IVeiculo> encontrarVeiculosPorPeriodo(Date dataInicial, Date dataFinal){
//		reservas.stream()
//				.filter(res -> !res.getDataDevolucao().after(dataInicial))
//				.filter(res -> !res.getDataRetirada().before(dataFinal))
//				.

		LinkedList<IVeiculo> returnList = new LinkedList<>();
		for(IReserva reserva: reservas){
			IVeiculo veiculo = reserva.getVeiculo();
			reserva.getDataDevolucao();
			if(reserva.getDataDevolucao().after(dataInicial)){
				returnList.remove(veiculo);
				continue;
			}

			if(reserva.getDataRetirada().before(dataFinal)){
				returnList.remove(veiculo);
				continue;
			}

			// Adiciona veículos
			returnList.add(veiculo);
		}

		return returnList;
	}

	/*
	logic.Reserva um veículo, então, retorna o objeto, já adicionado na base de dados
	*/
	public IReserva reservarVeiculo(
		Date dataInicial,
		Date dataFinal, 
		IVeiculo veiculo, 
		boolean limpezaInt,
		boolean limpezaExt,
		boolean seguro
	){
		Grupo g = new Grupo("basico", 0, 0, 0, 0, 0);

		int totalDias = 0; // Calcular total de dias
		float total;
		total = 0;
		total += g.getValorDiaria(veiculo.getGrupo()) * totalDias;
		total += seguro ? g.getDiariaSeguro(veiculo.getGrupo()) * totalDias : 0;

		total += limpezaExt ? g.getValorLimpezaExt(veiculo.getGrupo()) : 0;
		total += limpezaInt ? g.getValorLimpezaInt(veiculo.getGrupo()) : 0;

		veiculo.getGrupo();
		String codigo = ""; // => Gerar string aleatória
		IReserva reserva = new Reserva(
			veiculo,
			dataInicial,
			dataFinal,
			limpezaInt,
			limpezaExt,
			total,
			codigo,
			seguro
		);

		reservasAtuais.add(reserva);
		return reserva;
	}
}