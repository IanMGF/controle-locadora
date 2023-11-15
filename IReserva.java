public interface IReserva {
	IVeiculo getVeiculo();
	String getDataRetirada();
	String getDataDevolucao();
	boolean getLimpezaInt();
	boolean getLimpezaExt();
	boolean getSeguro();
	float getValor();
	String getCodigo();
}