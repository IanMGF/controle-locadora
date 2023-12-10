package logic;

import java.util.Date;

public class Reserva implements IReserva {
    private final IVeiculo veiculo;
    private final ICliente cliente;
    private final Date dataInicial;
    private final Date dataFinal;
    private final float total;
    private final String codigo;
    private final String status;

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

    public float getValor() {
        return total;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public ICliente getCliente() {
        return cliente;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
