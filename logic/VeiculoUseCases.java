package logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

import exceptions.*;

public class VeiculoUseCases{
    public static boolean validateVeiculo(String placa, String marca, String modelo, String cor, String ano, String grupo) throws MissingException, InvalidException, AlreadyAddedExeception{
        Calendar cal = new GregorianCalendar();

        //Checando strings
        if(placa == null){
            throw new MissingException("placa");
        }
        IVeiculo[] veiculosNaFrota = Frota.getVeiculos();
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

        return true;
    }

    public static void newVeiculo(String placa, String marca, String modelo, String cor, String ano, String grupo) throws MissingException, InvalidException, AlreadyAddedExeception{
        Calendar cal = new GregorianCalendar();
       
        //Checando strings
        if(placa == null){
            throw new MissingException("placa");
        }
        IVeiculo[] veiculosNaFrota = Frota.getVeiculos();
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
        Frota.addVeiculo(veiculo);

        System.out.println("Veículo adicionado com sucesso");
    }

    public static void deleteVeiculo(String placa, String motivo) throws MissingException, CurrentlyRentedException, InvalidException{
        
        if(placa == null){
            throw new MissingException("placa");
        }else{
            IVeiculo veiculo = Frota.getVeiculoByPlaca(placa);
            
            if(veiculo == null){
                throw new InvalidException(placa);
            }

            if((veiculo.getStatus()).equals("locado")){
                throw new CurrentlyRentedException(veiculo.getPlaca());
            }else{
                Frota.removeVeiculo(veiculo, motivo);
            }
            
        }
        
    }
}