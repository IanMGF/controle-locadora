package logic;

public interface IVeiculo {
	String getPlaca();
	String getMarca();
	String getModelo();
	String getCor();
	String getAno();
	String getGrupo();
	String getStatus();

	void setStatus(String motivo);
}