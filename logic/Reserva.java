package logic;

import java.util.Date;

public class Reserva implements IReserva {
    private IVeiculo veiculo;
    private ICliente cliente;
    private Date dataInicial;
    private Date dataFinal;
    private boolean limpezaInt;
    private boolean limpezaExt;
    private float total;
    private String codigo;
    private boolean seguro;
    private String status;

    public Reserva(IVeiculo veiculo, Date dataInicial, Date dataFinal, float total, String codigo, String cpf, String status) {
        this.veiculo = veiculo;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.total = total;
        this.codigo = codigo;
        this.status = status;
        this.cliente = ClientUseCases.encontrarPorCPF(cpf);
    }

    @Override
    public IVeiculo getVeiculo() {
        return veiculo;
    }

    public Date getDataRetirada() {
        return dataInicial;
    }

    public Date getDataDevolucao() {
        return dataFinal;
    }

    public boolean getLimpezaInt() {
        return limpezaInt;
    }

    public boolean getLimpezaExt() {
        return limpezaExt;
    }

    public float getValor() {
        return total;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public ICliente getCliente() {
        return null;
    }

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public boolean getSeguro() {
        return seguro;
    }
}
