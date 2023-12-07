package logic;

public class RelatorioUseCases {
    
    public static String getRelatorio(boolean clientes, boolean veiculo, boolean loc_res){
        String clientesStr = "", veiculoStr = "", loc_resStr = "";


        if(clientes){
            
        }
        
        if(veiculo){
            IVeiculo[] veiculos = Frota.getVeiculos();
            veiculoStr = "Relatorios de Clientes: \n";

            for(int i = 0; i < veiculos.length; i++){
                veiculoStr = (veiculoStr + "Placa: " + veiculos[i].getPlaca() + "| Marca: " + veiculos[i].getMarca() + "| Modelo: " + veiculos[i].getModelo() + "| Cor: " + 
                            veiculos[i].getCor() + "| Ano: " + veiculos[i].getAno() + "| logic.Grupo" + veiculos[i].getGrupo() + "| Status: " + veiculos[i].getStatus() + "\n");
            }
        }

        if(loc_res){
            
        }

        String relatorio = (clientesStr + veiculoStr + loc_resStr);
        return relatorio;
    }

}

