package visao;

public interface IGrupo {
	float getValorDiaria(String nome);
	void setValorDiaria(float valor, String nome);
	float getValorTanque(String nome);
	void setValorTanque(float valor, String nome);
	float getValorLimpezaExt(String nome);
	void setValorLimpezaExt(float valor, String nome);
	float getValorLimpezaInt(String nome);
	void setValorLimpezaInt(float valor, String nome);
	float getDiariaSeguro(String nome);
	void setDiariaSeguro(float valor, String nome);
}