package logic;

public class RelatorioUseCases {
    
    public static String getRelatorio(boolean clientes, boolean veiculo, boolean loc_res){
        String clientesStr = "", veiculoStr = "", loc_resStr = "";


        if(clientes){
            
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
            
        }

        String relatorio = (clientesStr + veiculoStr + loc_resStr);
        return relatorio;
    }

}

