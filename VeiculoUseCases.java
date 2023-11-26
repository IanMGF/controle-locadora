import java.util.Calendar;
import java.util.GregorianCalendar;

public class VeiculoUseCases{
    private static IFrota frota = new Frota();
    private static IVeiculo[] veiculosNaFrota = frota.getVeiculos();


    public static boolean newVeiculo(String placa, String marca, String modelo, String cor, String ano, String grupo){
        Calendar cal = new GregorianCalendar();
       
        //Checando strings
        if(placa == null){
            return false;
        }

        for(int i = 0; i < veiculosNaFrota.length; i++){
            if((veiculosNaFrota[i].getPlaca()).equals(placa)){
                return false;
            }
        }

        if(marca == null){
            return false;
        }

        if(modelo == null){
            return false;
        }

        if(cor == null){
            return false;
        }

        if(Integer.parseInt(ano) < 1886 || Integer.parseInt(ano) > cal.get(Calendar.YEAR)){
            return false;
        }

        if(!(grupo.equals("basico")||grupo.equals("padrao")||grupo.equals("premium"))){
            return false;
        }

        IVeiculo veiculo = new Veiculo(placa, marca, modelo, cor, ano, grupo, "disponivel");
        frota.addVeiculo(veiculo);
        return true;
    }

    public static boolean deleteVeiculo(String placa, String motivo){
        
        if(placa == null){
            return false;
        }else{
            IVeiculo veiculo;
            
            for(int i = 0; i < veiculosNaFrota.length; i++){
                if((veiculosNaFrota[i].getPlaca()).equals(placa)){
                    veiculo = veiculosNaFrota[i];
                }
            }

            if((veiculo.getStatus()).equals("locado")){
                return false;
            }else{
                frota.removeVeiculo(veiculo, motivo);
                return true;
            }
            
        }
        
    }
}