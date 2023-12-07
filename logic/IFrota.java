package logic;

public interface IFrota {
	IVeiculo[] getVeiculos();
	void addVeiculo(IVeiculo veiculo);
	void removeVeiculo(IVeiculo veiculo, String motivo);

	IVeiculo getVeiculoByPlaca(String placa);
}