package logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

import exceptions.*;

/**
 * A classe VeiculoUseCases fornece funcionalidades para gerenciar veículos.
 */
public class VeiculoUseCases{
    /**
     * Valida uma placa de veículo de acordo com os padrões brasileiros.
     * @param placa A placa a ser validada.
     * @return true se a placa for válida, false caso contrário.
     * @throws InvalidException Se a placa não seguir os padrões brasileiros.
     * @throws MissingException Se a placa for nula.
     * @throws AlreadyAddedExeception Se a placa já estiver em uso por outro veículo.
     */
    public static boolean validatePlaca(String placa) throws InvalidException, MissingException, AlreadyAddedExeception {
        // Checando strings
        if(placa == null){
            throw new MissingException("placa");
        }
        IVeiculo[] veiculosNaFrota = Frota.getVeiculos();
        for(int i = 0; i < veiculosNaFrota.length; i++){
            if((veiculosNaFrota[i].getPlaca()).equals(placa)){
                throw new AlreadyAddedExeception("placa");
            }
        }

        // Validando placa
        String regex = "[A-Z]{3}[0-9][0-9A-Z][0-9]{2}";
        if (!placa.matches(regex)) {
            throw new InvalidException("placa");
        }

        return true;
    }

    /**
     * Valida uma marca de veículo.
     * @param marca A marca a ser validada.
     * @return true se a marca for válida, false caso contrário.
     * @throws MissingException Se a marca for nula.
     */
    public static boolean validateMarca(String marca) throws MissingException {
        if(marca == null){
            throw new MissingException("marca");
        }

        return true;
    }

    /**
     * Valida um modelo de veículo.
     * @param modelo O modelo a ser validado.
     * @return true se o modelo for válido, false caso contrário.
     * @throws MissingException Se o modelo for nulo.
     */
    public static boolean validateModelo(String modelo) throws MissingException {
        if(modelo == null){
            throw new MissingException("modelo");
        }

        return true;
    }

    /**
     * Valida uma cor de veículo.
     * @param cor A cor a ser validada.
     * @return true se a cor for válida, false caso contrário.
     * @throws MissingException Se a cor for nula.
     */
    public static boolean validateCor(String cor) throws MissingException {
        if(cor == null){
            throw new MissingException("cor");
        }

        return true;
    }

    /**
     * Valida um ano de fabricação de veículo.
     * @param ano O ano a ser validado.
     * @return true se o ano for válido, false caso contrário.
     * @throws MissingException Se o ano for nulo.
     * @throws InvalidException Se o ano for menor que 1886 ou maior que o ano atual.
     */
    public static boolean validateAno(String ano) throws MissingException, InvalidException {
        Calendar cal = new GregorianCalendar();
        if(ano == null){
            throw new MissingException("ano");
        }

        int anoInt;
        try {
            anoInt = Integer.parseInt(ano);
        } catch(NumberFormatException e){
            throw new InvalidException("ano");
        }

        if(anoInt < 1886 || anoInt > cal.get(Calendar.YEAR)){
            throw new InvalidException("ano");
        }

        return true;
    }

    /**
     * Valida um grupo de veículo.
     * @param grupo O grupo a ser validado.
     * @return true se o grupo for válido, false caso contrário.
     * @throws MissingException Se o grupo for nulo.
     * @throws InvalidException Se o grupo não for "basico", "padrao" ou "premium".
     */
    public static boolean validateGrupo(String grupo) throws MissingException, InvalidException {
        if(grupo == null){
            throw new MissingException("grupo");
        }

        if(!(grupo.equals("basico")||grupo.equals("padrao")||grupo.equals("premium"))){
            throw new InvalidException("grupo");
        }

        return true;
    }

    /**
     * Cria um novo veículo e o adiciona à frota.
     * @param placa A placa do veículo.
     * @param marca A marca do veículo.
     * @param modelo O modelo do veículo.
     * @param cor A cor do veículo.
     * @param ano O ano de fabricação do veículo.
     * @param grupo O grupo do veículo.
     * @throws MissingException Se algum dos parâmetros for nulo.
     * @throws InvalidException Se a placa ou o ano não forem válidos.
     * @throws AlreadyAddedExeception Se a placa já estiver em uso por outro veículo.
     */
    public static void newVeiculo(String placa, String marca, String modelo, String cor, String ano, String grupo) throws MissingException, InvalidException, AlreadyAddedExeception {
        Calendar cal = new GregorianCalendar();

        // Validando parâmetros
        validatePlaca(placa);
        validateMarca(marca);
        validateModelo(modelo);
        validateCor(cor);
        validateAno(ano);
        validateGrupo(grupo);

        IVeiculo veiculo = new Veiculo(placa, marca, modelo, cor, ano, grupo, "disponivel");
        Frota.addVeiculo(veiculo);
    }

    /**
     * Remove um veículo da frota.
     * @param placa A placa do veículo a ser removido.
     * @param motivo O motivo da remoção.
     * @throws MissingException Se a placa for nula.
     * @throws CurrentlyRentedException Se o veículo estiver locado.
     * @throws InvalidException Se a placa não corresponder a nenhum veículo na frota.
     */
    public static void deleteVeiculo(String placa, String motivo) throws MissingException, CurrentlyRentedException, InvalidException {

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
                Frota.save();
            }

        }

    }
}