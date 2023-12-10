package logic;

import java.util.List;
import exceptions.*;

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
    public static String getRelatorio(boolean clientes, boolean veiculo, boolean loc_res) throws NotEnoughDataException {
        String clientesStr = "", veiculoStr = "", loc_resStr = "";

        if(clientes){
            List<ICliente> clientList = ClientDatabase.getClientsCopy();
            if(clientList.size() == 0){
                throw new NotEnoughDataException();
            }
            clientesStr = "Relatorios de Clientes (" + clientList.size() + " clientes registrados): \n";

            for(ICliente client : clientList){
                clientesStr = (clientesStr + "Nome: " + client.getNomeCompleto() + " | CPF: " + client.getCPF() + " | Data de nascimento: " + client.getNascimento() 
                                + " | Email: " + client.getEmail() + " | Celular: " + client.getCelular() + "\n");
            }
            clientesStr += "\n";
        }

        if(veiculo){
            IVeiculo[] veiculos = Frota.getVeiculos();
            if(veiculos.length == 0){
                throw new NotEnoughDataException();
            }
            veiculoStr = "Relatorios de Veículos(" + veiculos.length + " veículos na frota): \n";
            for (IVeiculo iVeiculo : veiculos) {
                veiculoStr = (veiculoStr + "Placa: " + iVeiculo.getPlaca() + " | Marca: " + iVeiculo.getMarca() + " | Modelo: " + iVeiculo.getModelo() + " | Cor: " +
                        iVeiculo.getCor() + " | Ano: " + iVeiculo.getAno() + " | Grupo: " + iVeiculo.getGrupo() + " | Status: " + iVeiculo.getStatus() + "\n");
            }
            veiculoStr += "\n";
        }

        if(loc_res){
            List<IReserva> reservaList = ReservaDatabase.getReservasCopy();
            if(reservaList.size() == 0){
                throw new NotEnoughDataException();
            }
            loc_resStr = "Relatorios de Reservas (" + reservaList.size() + " reservas registradas): \n";  
            
            for(IReserva reserva : reservaList){
                loc_resStr = (loc_resStr + "Identificador: " + reserva.getCodigo() + " | CPF-Cliente: " + reserva.getCPF()  + " | Data-Retirada: " + reserva.getDataRetirada() + 
                            " | Data-Devolucao: " + reserva.getDataDevolucao() + " | Valor-Locacao: " + reserva.getValor() + " | Status: " + reserva.getStatus() + "\n");
            }
            loc_resStr += "\n";
        }

        String relatorio = (clientesStr + veiculoStr + loc_resStr);
        return relatorio;
    }

}