package logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

import exceptions.*;

public class VeiculoUseCases{
    
    private static IFrota frota = new Frota();
    private static IVeiculo[] veiculosNaFrota = frota.getVeiculos();


    public static void newVeiculo(String placa, String marca, String modelo, String cor, String ano, String grupo) throws MissingException, InvalidException, AlreadyAddedExeception{
        Calendar cal = new GregorianCalendar();
       
        //Checando strings
        if(placa == null){
            throw new MissingException("placa");
        }

        for(int i = 0; i < veiculosNaFrota.length; i++){
            if((veiculosNaFrota[i].getPlaca()).equals(placa)){
                throw new AlreadyAddedExeception("placa");
            }
        }

        if(marca == null){
            throw new MissingException("marca");
        }

        if(modelo == null){
            throw new MissingException("modelo");
        }

        if(cor == null){
            throw new MissingException("cor");
        }

        if(ano == null){
            throw new MissingException("ano");
        }

        if(Integer.parseInt(ano) < 1886 || Integer.parseInt(ano) > cal.get(Calendar.YEAR)){
            throw new InvalidException("ano");
        }

        if(grupo == null){
            throw new MissingException("grupo");
        } 

        if(!(grupo.equals("basico")||grupo.equals("padrao")||grupo.equals("premium"))){
            throw new InvalidException("grupo");
        }

        IVeiculo veiculo = new Veiculo(placa, marca, modelo, cor, ano, grupo, "disponivel");
        frota.addVeiculo(veiculo);
    }

    public static void deleteVeiculo(String placa, String motivo) throws MissingException, CurrentlyRentedException, InvalidException{
        
        if(placa == null){
            throw new MissingException("placa");
        }else{
            IVeiculo veiculo = frota.getVeiculoByPlaca(placa);
            
            if(veiculo == null){
                throw new InvalidException(placa);
            }

            if((veiculo.getStatus()).equals("locado")){
                throw new CurrentlyRentedException(veiculo.getPlaca());
            }else{
                frota.removeVeiculo(veiculo, motivo);
            }
            
        }
        
    }
}