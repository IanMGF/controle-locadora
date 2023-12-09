package logic;

/**
 * A classe RelatorioUseCases é responsável por gerar relatórios com informações sobre clientes, veículos e locações/reservas.
 */
public class RelatorioUseCases {

    /**
     * Gera um relatório com informações sobre clientes, veículos e locações/reservas.
     * @param clientes Se true, inclui informações sobre clientes no relatório.
     * @param veiculo Se true, inclui informações sobre veículos no relatório.
     * @param loc_res Se true, inclui informações sobre locações/reservas no relatório.
     * @return O relatório gerado.
     */
    public static String getRelatorio(boolean clientes, boolean veiculo, boolean loc_res){
        String clientesStr = "", veiculoStr = "", loc_resStr = "";

        if(clientes){
            // TODO: adicionar informações sobre clientes
        }

        if(veiculo){
            IVeiculo[] veiculos = Frota.getVeiculos();
            veiculoStr = "Relatorios de Veículos: \n";

            for (IVeiculo iVeiculo : veiculos) {
                veiculoStr = (veiculoStr + "Placa: " + iVeiculo.getPlaca() + "| Marca: " + iVeiculo.getMarca() + "| Modelo: " + iVeiculo.getModelo() + "| Cor: " +
                        iVeiculo.getCor() + "| Ano: " + iVeiculo.getAno() + "| logic.Grupo" + iVeiculo.getGrupo() + "| Status: " + iVeiculo.getStatus() + "\n");
            }
        }

        if(loc_res){
            // TODO: adicionar informações sobre locações/reservas
        }

        String relatorio = (clientesStr + veiculoStr + loc_resStr);
        return relatorio;
    }

}