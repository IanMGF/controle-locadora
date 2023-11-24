public class ReservaUseCases {
	public List<IReserva> reservas;
	public List<IReserva> reservasAtuais;

	/*
	Retorna uma lista de veículos disponíveis no período
	*/
	public List<IVeiculo> encontrarVeiculosPorPeriodo(Date dataInicial, Date dataFinal){
		LinkedList<IVeiculo> returnList = new LinkedList<>();
		for(IReserva reserva: reservas){
			IVeiculo veiculo = reserva.getVeiculo();

			if(reserva.getDataDevolucao() > dataInicial){
				returnList.remove(veiculo);
				continue;
			}

			if(reserva.getDataRetirada() < dataFinal){
				returnList.remove(veiculo);
				continue;
			}

			// Adiciona veículos
			returnList.add(veiculo);
		}
	}

	/*
	Reserva um veículo, então, retorna o objeto, já adicionado na base de dados
	*/
	public IReserva reservarVeiculo(
		Date dataInicial, 
		Date dataFinal, 
		IVeiculo veiculo, 
		boolean limpezaInt,
		boolean limpezaExt,
		boolean seguro,
	){
		String codigo // => Gerar string aleatória
		IReserva reserva = new IReserva(
			veiculo,
			dataInicial,
			dataFinal,
			limpezaInt,
			limpezaExt,
			// calcular valor,
			codigo,
		)

		reservasAtuais.add(reserva);
		return reserva
	}
}