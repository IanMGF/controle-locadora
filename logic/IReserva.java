package logic;

import java.util.Date;

public interface IReserva {
	IVeiculo getVeiculo();
	Date getDataRetirada();
	Date getDataDevolucao();
	float getValor();
	String getCodigo();

	ICliente getCliente();

	String getStatus();
}