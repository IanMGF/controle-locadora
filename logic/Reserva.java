package logic;

import java.util.Date;

public class Reserva implements IReserva {
    private IVeiculo veiculo;
    private Date dataInicial;
    private Date dataFinal;
    private boolean limpezaInt;
    private boolean limpezaExt;
    private float total;
    private String codigo;
    private boolean seguro;

    public Reserva(IVeiculo veiculo, Date dataInicial, Date dataFinal, boolean limpezaInt, boolean limpezaExt, float total, String codigo, boolean seguro) {
        this.veiculo = veiculo;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.limpezaInt = limpezaInt;
        this.limpezaExt = limpezaExt;
        this.total = total;
        this.codigo = codigo;
        this.seguro = seguro;
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
    public boolean getSeguro() {
        return seguro;
    }
}
