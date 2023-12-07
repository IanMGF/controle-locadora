package logic;

public class Veiculo implements IVeiculo{
    private final String placa;
    private final String marca;
    private final String modelo;
    private final String cor;
    private final String ano;
    private final String grupo;
    private String status;

    public Veiculo(String placa, String marca, String modelo, String cor, String ano, String grupo, String status){

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.grupo = grupo;
        this.status = status;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public String getAno() {
        return ano;
    }

    @Override
    public String getGrupo() {
        return grupo;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String motivo) {
        this.status = motivo;
    }
}
