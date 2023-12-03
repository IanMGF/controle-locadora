import java.util.Date;

public interface IReserva {
	IVeiculo getVeiculo();
	Date getDataRetirada();
	Date getDataDevolucao();
	boolean getLimpezaInt();
	boolean getLimpezaExt();
	boolean getSeguro();
	float getValor();
	String getCodigo();
}