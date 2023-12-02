package exceptions;

public class InvalidCPFException extends Exception{
    private final String cpf;
    public InvalidCPFException(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
