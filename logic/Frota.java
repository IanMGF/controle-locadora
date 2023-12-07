package logic;

import java.util.LinkedList;

public class Frota implements IFrota{
    private LinkedList<IVeiculo> veiculos = new LinkedList<>();

    @Override
    public IVeiculo[] getVeiculos() {
        return veiculos.toArray(IVeiculo[]::new);
    }

    @Override
    public void addVeiculo(IVeiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public void removeVeiculo(IVeiculo veiculo, String motivo) {
        veiculos.stream()
                .filter(v -> v.equals(veiculo))
                .findFirst()
                .ifPresent(v -> v.setStatus(motivo));
    }

    @Override
    public IVeiculo getVeiculoByPlaca(String placa) {
        return veiculos.stream()
                        .filter(v -> v.getPlaca().equals(placa))
                        .findFirst()
                        .orElse(null);
    }
}
