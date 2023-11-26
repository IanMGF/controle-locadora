public interface IFrota {
	IVeiculo[] getVeiculos();
	void addVeiculo(IVeiculo veiculo);
	void removeVeiculo(IVeiculo veiculo, String motivo);
}