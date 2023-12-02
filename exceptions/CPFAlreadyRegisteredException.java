package exceptions;

public class CPFAlreadyRegisteredException extends Exception{
    private final String cpf;
    public CPFAlreadyRegisteredException(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
